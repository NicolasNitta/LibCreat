package api_web.api_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_web.api_web.model.Mensagem.Mensagem;

public interface MensagemRepository<T extends Mensagem> extends JpaRepository<T, Long>{
    
}
