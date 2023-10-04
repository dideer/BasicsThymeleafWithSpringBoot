package net.didier.thymeleafspringboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/if-unless")
    public String Users (Model model){
        
        List<User> users= new ArrayList<>();

        users.add(new User("Didier", "ishimwe@gmai.com", "ADMIN"));
        users.add(new User("Bwasisi", "Sadia@gmail.com", "USER"));
        users.add(new User("Vanessa", "Uwase@gmail.com", "USER"));

        model.addAttribute("users", users);

        return"if-unless";

    }


    @GetMapping("/switch-case")
    public String switchExample(Model model){
        User user= new User("Didier", "Ishimwe@gmail.com", "ADMIN");
        model.addAttribute("user", user);
        return"switch-case";
    }

}
