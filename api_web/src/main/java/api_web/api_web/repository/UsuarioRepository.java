package api_web.api_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_web.api_web.model.Usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
