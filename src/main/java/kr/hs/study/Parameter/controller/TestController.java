package kr.hs.study.Parameter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    @GetMapping("/input")
    public String input() {
        return "input_form";
    }

    @PostMapping("/re_input")
    public String re_input(HttpServletRequest req, Model model) {
        int num = Integer.parseInt(req.getParameter("num"));
        int[] gugudan = new int[9];
        for(int i=1; i<=9; i++) {
           gugudan[i-1] = num*i;
        }
        model.addAttribute("num", num);
        model.addAttribute("gugudan", gugudan);
        return "result";
    }

}
