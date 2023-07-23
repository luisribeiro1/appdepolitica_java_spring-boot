package br.com.appdepolitica.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/proposicoes")
public class ProposicaoController {

    @GetMapping
    public String mostraProposicoes() {
        return "proposicoes/listagem";
    }

}
