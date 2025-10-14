package springboot_developer.myownsoil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    // 렌더링 테스트
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello test");
        return "hello";
    }
}
