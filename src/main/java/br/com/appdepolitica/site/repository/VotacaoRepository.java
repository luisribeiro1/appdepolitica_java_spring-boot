package br.com.appdepolitica.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.appdepolitica.site.domain.deputado.Deputado;
import br.com.appdepolitica.site.domain.votacao.Votacao;

import java.util.List;

public interface VotacaoRepository extends JpaRepository<Votacao, String> {

}
