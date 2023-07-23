package br.com.appdepolitica.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.appdepolitica.site.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuario;

    @GetMapping
    public String carregaUsuario(Model model){
        model.addAttribute("lista", usuario.findAll());
        return "usuarios/listagem";
    }

}
