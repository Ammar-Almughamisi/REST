package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String nameToCaps(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase() + "test ";
        model.addAttribute("message", name);
        return "helloworld";
    }

    @RequestMapping("/processFormThree")
    public String nameToCapsTwo(@RequestParam("studentName") String name, Model model) {
        name = name.toUpperCase() + "test ";
        model.addAttribute("message", name);
        return "helloworld";
    }
}
