package br.com.appdepolitica.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/partidos")
public class PartidoController {

    @GetMapping
    public String mostraPartido() {
        return "partidos/listagem";
    }

}
