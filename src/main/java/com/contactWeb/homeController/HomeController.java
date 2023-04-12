package com.contactWeb.homeController;

import com.contactWeb.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Home-Contact Web");
        return "home";
    }
    @RequestMapping("/sign-up")
    public String signup(Model model){
        model.addAttribute("title", "Sign Up");
        model.addAttribute("user", new User());
        return "signup";
    }
    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("title", "Login");
        return "login";
    }
    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "About Us");
        return "about";
    }
    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") User user,@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model){
        System.out.println("Agreement: "+ agreement);
        System.out.println("USER: "+user);
        return "register";
    }
}
