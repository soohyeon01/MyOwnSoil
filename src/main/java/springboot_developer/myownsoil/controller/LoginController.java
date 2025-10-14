package springboot_developer.myownsoil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // login.html 렌더링
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // signup.html 렌더링
    }
/*
    @PostMapping("/signup")
    public String signupSubmit(UserDto userDto) {
        // 회원가입 로직 추가
        return "redirect:/login";
    }
    */
}
