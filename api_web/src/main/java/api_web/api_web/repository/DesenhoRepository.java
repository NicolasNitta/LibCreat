package api_web.api_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_web.api_web.model.Desenho.Desenho;

public interface DesenhoRepository extends JpaRepository<Desenho, Long>{
    
}
