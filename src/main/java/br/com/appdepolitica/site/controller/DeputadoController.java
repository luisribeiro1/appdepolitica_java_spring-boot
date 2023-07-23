package br.com.appdepolitica.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.appdepolitica.site.domain.deputado.Deputado;
import br.com.appdepolitica.site.repository.DeputadoRepository;
import br.com.appdepolitica.site.repository.LegislaturaRepository;

import java.util.List;

@Controller
@RequestMapping("/deputados")
public class DeputadoController {

    @Autowired
    private DeputadoRepository deputadoRepository;
    @Autowired
    private LegislaturaRepository legislatura;

    @GetMapping
    public String carregaDeputado(@RequestParam Long idLeg, Model  model){
        List<Deputado> lista = deputadoRepository.findByLegislatura(idLeg);
        model.addAttribute("lista", lista);
        model.addAttribute("info", legislatura.findById(idLeg));
        return "deputados/listagem";
    }


//    @GetMapping
//    public String carregaDeputado(Long idLeg, Model  model){
//        model.addAttribute("lista", deputado.findByIdLegislatura(idLeg));
//        model.addAttribute("info", legislatura.findById(idLeg));
//        return "deputados/listagem";
//    }

}
