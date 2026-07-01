package com.example.budget.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Setup {
    @Id
    private Long id = 1L;
    private double startingBalance;

    public Setup() {}
    public Setup(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public double getStartingBalance() { return startingBalance; }
    public void setStartingBalance(double startingBalance) { this.startingBalance = startingBalance; }
}