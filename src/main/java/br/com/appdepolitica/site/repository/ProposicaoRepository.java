package br.com.appdepolitica.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.appdepolitica.site.domain.proposicao.Proposicao;

import java.util.List;

public interface ProposicaoRepository extends JpaRepository<Proposicao, Long> {
    @Query("FROM Proposicao p WHERE p.id = :idProposicao")
    Proposicao buscaPorId(int idProposicao);
}

