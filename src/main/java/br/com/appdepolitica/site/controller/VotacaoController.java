package br.com.appdepolitica.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.appdepolitica.site.domain.votacao.Votacao;
import br.com.appdepolitica.site.repository.VotacaoProposicaoRepository;
import br.com.appdepolitica.site.repository.VotacaoRepository;

import java.util.List;

@Controller
@RequestMapping("/votacao")
public class VotacaoController {

    @Autowired
    private VotacaoRepository votacaoRepository;
    @Autowired
    private VotacaoProposicaoRepository votacaoProposicaoRepository;

    @GetMapping
    public String listaVotacoes(Model model){
        // List<Votacao> lista = votacaoRepository.findByVotacao();
        model.addAttribute("votacoes", votacaoRepository.findAll());
        return "votacoes/listagem";


    }

}
