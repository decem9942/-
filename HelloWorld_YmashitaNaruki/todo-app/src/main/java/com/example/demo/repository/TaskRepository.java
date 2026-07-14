package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
    // ⬇️ ユーザー名(String)でタスク一覧を取得するように修正します
    List<Task> findByUsername(String username);
    
}