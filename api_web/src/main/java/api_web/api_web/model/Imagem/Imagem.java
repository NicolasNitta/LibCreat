package api_web.api_web.model.Imagem;

import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table (name = "Imagem")
@Entity

public class Imagem extends Mensagem{
    
    private String texto_url;

}

