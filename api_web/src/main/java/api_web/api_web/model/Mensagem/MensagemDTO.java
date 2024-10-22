package api_web.api_web.model.Mensagem;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class MensagemDTO {

    private String titulo;
    private Long curtidas;
    private LocalDate dataHora = LocalDate.now();
    private String destinatario;
}
