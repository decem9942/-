package com.example.budget.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull
    private TransactionType type;

    @NotBlank
    private String category;

    @NotBlank
    private String subcategory;

    @Min(1) @Max(12)
    private int month;

    @Min(2000)
    private int year;

    @PositiveOrZero
    private double amount;

    public Transaction() {}
    public Transaction(TransactionType type, String category, String subcategory, int month, int year, double amount) {
        this.type = type;
        this.category = category;
        this.subcategory = subcategory;
        this.month = month;
        this.year = year;
        this.amount = amount;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public TransactionType getType() { return type; }
    public void setType(TransactionType type) { this.type = type; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getSubcategory() { return subcategory; }
    public void setSubcategory(String subcategory) { this.subcategory = subcategory; }
    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = month; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}