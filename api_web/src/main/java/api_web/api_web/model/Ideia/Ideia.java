package api_web.api_web.model.Ideia;

import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity


public class Ideia extends Mensagem{
    
    private String texto;

}
