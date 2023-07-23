package br.com.appdepolitica.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.appdepolitica.site.repository.LegislaturaRepository;

@Controller
@RequestMapping("/legislaturas")
public class LegislaturaController {

    @Autowired
    private LegislaturaRepository legislatura;

    @GetMapping
    public String carregaLegislatura(Model model){
        model.addAttribute("lista", legislatura.findAll());
        return "legislaturas/listagem";
    }

}
