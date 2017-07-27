package com.example.haq;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oracle on 7/26/17.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String Homepage(Model model){
        model.addAttribute("message", "This is my Java Application.");
        return "home";

    }

    /**
     * Created by oracle on 7/26/17.
     */
    public static class Greeting {
    }
}
