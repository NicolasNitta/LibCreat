package api_web.api_web.model.Mensagem;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Data
@Getter
@Setter

public abstract class Mensagem {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMensagem;
    private String titulo;
    private Long curtidas;
    private LocalDate dataHora = LocalDate.now();
    private String destinatario; //Teoricamente, esse é o nickname de outro usuário.

}
