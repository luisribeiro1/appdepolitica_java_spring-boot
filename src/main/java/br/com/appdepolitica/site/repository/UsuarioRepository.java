package br.com.appdepolitica.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.appdepolitica.site.domain.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
