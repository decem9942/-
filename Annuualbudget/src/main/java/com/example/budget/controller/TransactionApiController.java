package com.example.budget.controller;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.budget.model.Transaction;
import com.example.budget.model.TransactionType;
import com.example.budget.service.BudgetService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionApiController {
    private final BudgetService budgetService;
    public TransactionApiController(BudgetService budgetService) { this.budgetService = budgetService; }

    @GetMapping("/expenses")
    public List<Transaction> getExpenses() { return budgetService.getExpenses(); }

    @GetMapping("/income")
    public List<Transaction> getIncomes() { return budgetService.getIncomes(); }

    @PostMapping
    public Transaction create(@Valid @RequestBody Transaction transaction) { return budgetService.addTransaction(transaction); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { budgetService.deleteTransaction(id); }

    @GetMapping("/types")
    public TransactionType[] getTypes() { return TransactionType.values(); }
}