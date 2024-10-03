package api_web.api_web.repository;

import org.springframework.data.repository.CrudRepository;

import api_web.api_web.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
}
