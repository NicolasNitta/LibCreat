package api_web.api_web.model.Ideia;

import api_web.api_web.model.Mensagem.MensagemDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class IdeiaDTO extends MensagemDTO{

    private String texto;
    private Long usuario_id;
}
