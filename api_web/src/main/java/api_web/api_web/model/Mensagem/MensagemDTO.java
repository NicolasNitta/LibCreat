package api_web.api_web.model.Mensagem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class MensagemDTO {

    private String titulo;
    private Long curtidas;
    private String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm"));
    private String destinatario;
}
