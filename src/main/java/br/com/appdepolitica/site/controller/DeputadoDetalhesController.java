package br.com.appdepolitica.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import br.com.appdepolitica.site.domain.deputado.DeputadoDespesas;
import br.com.appdepolitica.site.domain.deputado.DeputadoDetalhes;
import br.com.appdepolitica.site.repository.DeputadoRepository;
import br.com.appdepolitica.site.repository.ProposicaoAutoresRepository;
import br.com.appdepolitica.site.repository.ProposicaoRepository;

@Controller
@RequestMapping("/deputado")
public class DeputadoDetalhesController {

    @Autowired
    private DeputadoRepository deputado;
    @Autowired
    private ProposicaoAutoresRepository propAutores;
    @Autowired
    private ProposicaoRepository proposicaoRepository;

    @GetMapping
    public ModelAndView detalhesDeputado(int id) {

        ModelAndView mv = new ModelAndView("deputados/detalhes");

        RestTemplate restTemplate = new RestTemplate();

        // Dados do deputado
        String apiUrl = "https://dadosabertos.camara.leg.br/api/v2/deputados/" + id;
        DeputadoDetalhes depDetalhes = restTemplate.getForObject(apiUrl, DeputadoDetalhes.class);
        mv.addObject("deputados", depDetalhes);

        // Despesas
        String apiUrlDespesas = "https://dadosabertos.camara.leg.br/api/v2/deputados/" + id + "/despesas?ordem=ASC&ordenarPor=ano";
        DeputadoDespesas depDespesas = restTemplate.getForObject(apiUrlDespesas, DeputadoDespesas.class);
        mv.addObject("despesas", depDespesas);

        // Proposições por autor
//        Iterable<ProposicaoAutores> proposicaoAutores = propAutores.findByidDeputadoAutor2(id);
//        mv.addObject("preposicoesAutores", proposicaoAutores);

        // Proposições correspondentes aos ProposicaoAutores
//        List<ProposicaoDetalhes> proposicoesDetalhes = new ArrayList<>();
//        for (ProposicaoAutores pa : proposicaoAutores) {
//            Proposicao proposicao = proposicaoRepository.buscaPorId(pa.getIdProposicao());
//            ProposicaoDetalhes proposicaoDetalhes = new ProposicaoDetalhes(proposicao, pa);
//            proposicoesDetalhes.add(proposicaoDetalhes);
//        }
//        mv.addObject("proposicoesDetalhes", proposicoesDetalhes);

        return mv;
    }

}
