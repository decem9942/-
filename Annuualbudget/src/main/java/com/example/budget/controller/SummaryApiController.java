package com.example.budget.controller;

import com.example.budget.dto.MonthlySummary;
import com.example.budget.service.BudgetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.Year;
import java.util.List;

@RestController
@RequestMapping("/api/summary")
public class SummaryApiController {
    private final BudgetService budgetService;
    public SummaryApiController(BudgetService budgetService) { this.budgetService = budgetService; }

    @GetMapping
    public List<MonthlySummary> getSummary() {
        return budgetService.getYearlySummary(Year.now().getValue());
    }
}