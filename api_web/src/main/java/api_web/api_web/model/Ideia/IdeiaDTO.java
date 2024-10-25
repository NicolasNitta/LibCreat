package api_web.api_web.model.Ideia;

import java.util.List;
import api_web.api_web.model.Desenho.Desenho;
import api_web.api_web.model.Mensagem.MensagemDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class IdeiaDTO extends MensagemDTO{

    private String texto;

    // @OneToMany (mappedBy = "ideia", cascade = CascadeType.ALL)
    private List<Desenho> desenho;
}
