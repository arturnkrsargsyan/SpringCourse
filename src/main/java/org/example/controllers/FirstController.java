package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        ;
        System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String add(@RequestParam(value = "a", required = false) Integer a,
                      @RequestParam(value = "b", required = false) Integer b,
                      @RequestParam(value = "action", required = false) String action,
                      Model model) {
        if (a != null && b != null) {
            switch (action) {
                case "addition":
                    model.addAttribute("calculate", a + b);
                    break;
                case "subtraction":
                    model.addAttribute("calculate", a - b);
                    break;
                case "division":
                    model.addAttribute("calculate", a / b);
                    break;
                case "multiplication":
                    model.addAttribute("calculate", a * b);
                    break;
            }
            System.out.println(a + b);
        }
        return "first/calculator";
    }
}
