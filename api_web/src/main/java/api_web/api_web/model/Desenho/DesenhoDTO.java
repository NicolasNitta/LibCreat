package api_web.api_web.model.Desenho;

import api_web.api_web.model.Ideia.Ideia;
import api_web.api_web.model.Mensagem.MensagemDTO;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DesenhoDTO extends MensagemDTO{

    private String tag;
    
    @ManyToOne
    private Ideia ideia;
    
}
