package api_web.api_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_web.api_web.model.Ideia.Ideia;

public interface IdeiaRepository <E extends MensagemRepository> extends JpaRepository<Ideia, Long>{
    
}
