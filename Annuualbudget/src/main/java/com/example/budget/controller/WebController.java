package com.example.budget.controller;

import com.example.budget.model.Transaction;
import com.example.budget.model.TransactionType;
import com.example.budget.service.BudgetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.Year;

@Controller
public class WebController {
    private final BudgetService budgetService;
    public WebController(BudgetService budgetService) { this.budgetService = budgetService; }

    @GetMapping("/")
    public String index() { return "redirect:/setup"; }

    @GetMapping("/setup")
    public String setupPage(Model model) {
        model.addAttribute("setup", budgetService.getSetup());
        return "setup";
    }

    @PostMapping("/setup")
    public String saveSetup(@RequestParam double startingBalance) {
        budgetService.updateStartingBalance(startingBalance);
        return "redirect:/setup";
    }

    @GetMapping("/expenses")
    public String expensesPage(Model model) {
        model.addAttribute("transactions", budgetService.getExpenses());
        model.addAttribute("newTransaction", new Transaction());
        model.addAttribute("currentYear", Year.now().getValue());
        return "expenses";
    }

    @PostMapping("/expenses")
    public String addExpense(@RequestParam String category, @RequestParam String subcategory,
                             @RequestParam int month, @RequestParam int year, @RequestParam double amount) {
        budgetService.addTransaction(new Transaction(TransactionType.EXPENSE, category, subcategory, month, year, amount));
        return "redirect:/expenses";
    }

    @PostMapping("/expenses/{id}/delete")
    public String deleteExpense(@PathVariable Long id) {
        budgetService.deleteTransaction(id);
        return "redirect:/expenses";
    }

    @GetMapping("/income")
    public String incomePage(Model model) {
        model.addAttribute("transactions", budgetService.getIncomes());
        model.addAttribute("newTransaction", new Transaction());
        model.addAttribute("currentYear", Year.now().getValue());
        return "income";
    }

    @PostMapping("/income")
    public String addIncome(@RequestParam String category, @RequestParam String subcategory,
                            @RequestParam int month, @RequestParam int year, @RequestParam double amount) {
        budgetService.addTransaction(new Transaction(TransactionType.INCOME, category, subcategory, month, year, amount));
        return "redirect:/income";
    }

    @PostMapping("/income/{id}/delete")
    public String deleteIncome(@PathVariable Long id) {
        budgetService.deleteTransaction(id);
        return "redirect:/income";
    }

    @GetMapping("/summary")
    public String summaryPage(Model model) {
        int currentYear = Year.now().getValue();
        model.addAttribute("months", budgetService.getYearlySummary(currentYear));
        model.addAttribute("totalIncome", budgetService.getTotalIncome(currentYear));
        model.addAttribute("totalExpense", budgetService.getTotalExpense(currentYear));
        model.addAttribute("currentYear", currentYear);
        return "summary";
    }
}