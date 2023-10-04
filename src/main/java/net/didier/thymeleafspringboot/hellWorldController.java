package net.didier.thymeleafspringboot;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class hellWorldController {

    @GetMapping("/hello")
    public String hello(Model model){

        model.addAttribute("message","hello world");
        return "helloworld";
    }

     @GetMapping("/style")
    public String style(){

        
        return "add-css-js-demo";
    }

     @GetMapping("/bootstrap")
    public String bootstrap(){

        
        return "bootstrap";
    }




}
