package br.com.appdepolitica.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.appdepolitica.site.domain.deputado.Deputado;
import br.com.appdepolitica.site.domain.proposicao.ProposicaoAutores;

public interface ProposicaoAutoresRepository extends JpaRepository<ProposicaoAutores, Long> {

    @Query("SELECT pa FROM ProposicaoAutores pa WHERE pa.idDeputadoAutor = :idDeputado")
    Iterable<ProposicaoAutores> findByidDeputadoAutor2(int idDeputado);
}
