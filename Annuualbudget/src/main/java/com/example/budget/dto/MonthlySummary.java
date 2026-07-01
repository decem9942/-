package com.example.budget.dto;

public class MonthlySummary {
    private final int month;
    private double income;
    private double expense;
    private double endingBalance;

    public MonthlySummary(int month) { this.month = month; }
    public int getMonth() { return month; }
    public double getIncome() { return income; }
    public void addIncome(double amount) { this.income += amount; }
    public double getExpense() { return expense; }
    public void addExpense(double amount) { this.expense += amount; }
    public double getNetSavings() { return income - expense; }
    public double getEndingBalance() { return endingBalance; }
    public void setEndingBalance(double endingBalance) { this.endingBalance = endingBalance; }
}