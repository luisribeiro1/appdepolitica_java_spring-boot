package br.com.appdepolitica.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.appdepolitica.site.domain.votacao.VotacaoProposicao;

import java.util.List;

public interface VotacaoProposicaoRepository extends JpaRepository<VotacaoProposicao, Long> {

}
