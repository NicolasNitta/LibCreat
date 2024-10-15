package api_web.api_web.model.Imagem;

import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class Imagem extends Mensagem{
    
    private String url;

}
