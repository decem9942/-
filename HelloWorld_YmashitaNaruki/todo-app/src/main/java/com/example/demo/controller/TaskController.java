package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Login;
import com.example.demo.model.Task;
import com.example.demo.repository.LoginRepository;
import com.example.demo.repository.TaskRepository;

@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private LoginRepository loginRepository;

    // トップページ（/）にアクセスが来たら、homePage.html を表示する
    @GetMapping("/")
    public String home() {
        return "homePage";
    }

    // ユーザー登録（/register）にアクセスが来たら、register.html を表示する
    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }

    // --- ログイン関連 of ルーティング ---

    // 1. ログイン画面の表示 (GET /login)
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    // ユーザー登録画面からデータが届いた時の処理
    @GetMapping("/login_register")
    public String registerAndLogin(@RequestParam("username") String username, 
                                   @RequestParam("password") String password) {
        Login newUser = new Login();
        newUser.setUsername(username);
        newUser.setPassword(password);
        loginRepository.save(newUser);
        return "login";
    }

    // 2. ログイン処理 (POST /login)
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, 
                        @RequestParam("password") String password, 
                        HttpSession session) {
        
        System.out.println("--- ログイン処理が呼び出されました ---");
        Optional<Login> userOpt = loginRepository.findByUsername(username);
        
        if (userOpt.isPresent()) {
            Login user = userOpt.get();
            if (user.getPassword().equals(password)) {
                session.setAttribute("user", user);
                return "redirect:/tasks"; 
            }
        }
        return "redirect:/login?error";
    }

    // 3. ログアウト処理 (GET /logout)
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    // --- タスク関連のルーティング ---

    // 4. タスク一覧の表示 (GET /tasks)
    @GetMapping("/tasks")
    public String listTasks(Model model, HttpSession session) {
        Login user = (Login) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }

        List<Task> tasks = taskRepository.findByUsername(user.getUsername());
        
        model.addAttribute("tasks", tasks);
        model.addAttribute("username", user.getUsername());
        return "tasks";
    }

    // 💡【追加】5. タスク新規作成画面の表示 (GET /tasks/new)
    @GetMapping("/tasks/new")
    public String newTaskForm(Model model, HttpSession session) {
        Login user = (Login) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }
        
        // フォーム用の空のタスクオブジェクトを渡す
        Task task = new Task();
        // ログイン中のユーザー名を最初から登録者としてセットしておく場合
        task.setName(user.getUsername()); 
        
        model.addAttribute("task", task);
        
        // ※お手元の新規作成用のHTMLファイル名に合わせてください（例: create_form）
        return "create_form"; 
    }

    // 💡【追加】6. タスクの登録処理 (POST /tasks)
    @PostMapping("/tasks")
    public String createTask(@ModelAttribute Task task, HttpSession session) {
        Login user = (Login) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }
        
        // タスクに現在ログイン中のユーザー名を紐付ける
        task.setUsername(user.getUsername());
        
        // データベースに保存
        taskRepository.save(task);
        
        // 保存したら一覧画面にリダイレクト
        return "redirect:/tasks";
    }
}