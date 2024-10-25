package api_web.api_web.model.Imagem;

import api_web.api_web.model.Mensagem.MensagemDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImagemDTO extends MensagemDTO{
    
    private String texto_url;

}
