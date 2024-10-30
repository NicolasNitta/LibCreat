package api_web.api_web.model.Desenho;

import api_web.api_web.model.Ideia.Ideia;
import api_web.api_web.model.Mensagem.MensagemDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DesenhoDTO extends MensagemDTO{

    private String tag;
    
    private Ideia ideia;
    
}
