package com.example.demo;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;

@SpringBootApplication
public class TodoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoAppApplication.class, args);
    }

    // ⬇️ 起動時にテストユーザーをDBに自動登録する処理を追加
    @Bean
    public CommandLineRunner initDatabase(LoginRepository loginRepository) {
        return args -> {
            String testUsername = "testuser";
            String testPassword = "password123";

            Optional<Login> existing = loginRepository.findByUsername(testUsername);
            if (existing.isEmpty()) {
                Login testUser = new Login();
                testUser.setUsername(testUsername);
                testUser.setPassword(testPassword); // 平文で保存
                loginRepository.save(testUser);
                System.out.println("=== 【検証用】テストユーザーを登録しました ===");
                System.out.println("ユーザー名: " + testUsername);
                System.out.println("パスワード: " + testPassword);
                System.out.println("===========================================");
            }
        };
    }
}