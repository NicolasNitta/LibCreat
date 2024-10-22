package api_web.api_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import api_web.api_web.model.Imagem.Imagem;

@NoRepositoryBean
public interface ImagemRepository<I extends MensagemRepository> extends JpaRepository<Imagem, Long>{
}
