package com.tt.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tt.controller.BaseController;

@Controller
public class SystemController{

	@GetMapping("/hello")
	@ResponseBody
    public String handle(Model model) {
        model.addAttribute("message", "Hello World!");
        System.out.println("aaaa11122222 传 啊  2222222222212 4222  2222");
        //111 222 444
        return "index";
    }
}
