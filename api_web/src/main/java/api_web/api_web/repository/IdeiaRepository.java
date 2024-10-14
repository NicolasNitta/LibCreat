package api_web.api_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_web.api_web.model.Ideia.Ideia;

public interface IdeiaRepository extends JpaRepository<Ideia, Long>{
    
}
