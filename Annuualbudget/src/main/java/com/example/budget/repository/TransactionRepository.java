package com.example.budget.repository;

import com.example.budget.model.Transaction;
import com.example.budget.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByTypeOrderByMonthAsc(TransactionType type);
    List<Transaction> findByTypeAndYearOrderByMonthAsc(TransactionType type, int year);
}