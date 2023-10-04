package net.didier.thymeleafspringboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/iteration")
    public String iteration(Model model){
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee("Ishimwe", "didier", "didier221@gmail.com"));
        employees.add(new Employee("Ishimwe", "didier", "didier221@gmail.com"));
        employees.add(new Employee("Ishimwe", "didier", "didier221@gmail.com"));

        model.addAttribute("employees", employees);
        return "iteration";
    }
    
}
