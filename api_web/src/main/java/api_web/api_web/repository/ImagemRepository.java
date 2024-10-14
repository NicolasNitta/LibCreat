package api_web.api_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_web.api_web.model.Imagem.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long>{
}
