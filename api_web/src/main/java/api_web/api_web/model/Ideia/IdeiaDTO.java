package api_web.api_web.model.Ideia;

import java.util.List;
import api_web.api_web.model.Desenho.Desenho;
import api_web.api_web.model.Mensagem.MensagemDTO;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class IdeiaDTO extends MensagemDTO{

    private String texto;

    private List<Desenho> desenho;
}
