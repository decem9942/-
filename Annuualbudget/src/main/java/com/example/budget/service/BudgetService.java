package com.example.budget.service;

import com.example.budget.dto.MonthlySummary;
import com.example.budget.model.Setup;
import com.example.budget.model.Transaction;
import com.example.budget.model.TransactionType;
import com.example.budget.repository.SetupRepository;
import com.example.budget.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BudgetService {
    private final SetupRepository setupRepository;
    private final TransactionRepository transactionRepository;

    public BudgetService(SetupRepository setupRepository, TransactionRepository transactionRepository) {
        this.setupRepository = setupRepository;
        this.transactionRepository = transactionRepository;
    }

    public Setup getSetup() {
        return setupRepository.findById(1L).orElseGet(() -> {
            Setup s = new Setup(0);
            s.setId(1L);
            return setupRepository.save(s);
        });
    }

    public Setup updateStartingBalance(double balance) {
        Setup setup = getSetup();
        setup.setStartingBalance(balance);
        return setupRepository.save(setup);
    }

    public List<Transaction> getExpenses() {
        return transactionRepository.findByTypeOrderByMonthAsc(TransactionType.EXPENSE);
    }

    public List<Transaction> getIncomes() {
        return transactionRepository.findByTypeOrderByMonthAsc(TransactionType.INCOME);
    }

    public Transaction addTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }

    public List<MonthlySummary> getYearlySummary(int year) {
        List<MonthlySummary> months = new ArrayList<>();
        for (int m = 1; m <= 12; m++) {
            months.add(new MonthlySummary(m));
        }

        List<Transaction> incomeList = transactionRepository.findByTypeAndYearOrderByMonthAsc(TransactionType.INCOME, year);
        List<Transaction> expenseList = transactionRepository.findByTypeAndYearOrderByMonthAsc(TransactionType.EXPENSE, year);

        for (Transaction t : incomeList) {
            months.get(t.getMonth() - 1).addIncome(t.getAmount());
        }
        for (Transaction t : expenseList) {
            months.get(t.getMonth() - 1).addExpense(t.getAmount());
        }

        double runningBalance = getSetup().getStartingBalance();
        for (MonthlySummary ms : months) {
            runningBalance += ms.getNetSavings();
            ms.setEndingBalance(runningBalance);
        }
        return months;
    }

    public double getTotalIncome(int year) {
        return transactionRepository.findByTypeAndYearOrderByMonthAsc(TransactionType.INCOME, year)
                .stream().mapToDouble(Transaction::getAmount).sum();
    }

    public double getTotalExpense(int year) {
        return transactionRepository.findByTypeAndYearOrderByMonthAsc(TransactionType.EXPENSE, year)
                .stream().mapToDouble(Transaction::getAmount).sum();
    }
}