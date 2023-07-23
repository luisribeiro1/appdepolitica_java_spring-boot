package br.com.appdepolitica.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import br.com.appdepolitica.site.domain.deputado.Deputado;

import java.util.List;

public interface DeputadoRepository extends JpaRepository<Deputado, Long> {

//    @Query("""
//            SELECT d.id, d.nome, d.urlFoto, d.email, m.siglaPartido, m.siglaUf, l.dataInicio, l.dataFim
//            FROM deputados d INNER JOIN mandatos m ON d.id = m.idDeputado
//            INNER JOIN legislaturas l ON l.id = m.idLegislatura
//            WHERE m.idLegislatura = 57
//            """)

    @Query("FROM Deputado d JOIN d.mandatos m WHERE m.legislatura.id = :idLegislatura")
    public List<Deputado> findByLegislatura(Long idLegislatura);



}
