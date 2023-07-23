package br.com.appdepolitica.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String redirectToDashboard() {
        return "redirect:/dashboard";
    }
    @GetMapping("/dashboard")
    public String mostraDashboard() {
        return "dashboard/index";
    }

}
