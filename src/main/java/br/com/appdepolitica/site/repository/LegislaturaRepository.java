package br.com.appdepolitica.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.appdepolitica.site.domain.legislatura.Legislatura;

import java.util.List;

public interface LegislaturaRepository extends JpaRepository<Legislatura, Long> {

//    List<Legislatura> findById(Long id);
}
