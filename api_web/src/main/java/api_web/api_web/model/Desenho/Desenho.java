package api_web.api_web.model.Desenho;

import api_web.api_web.model.Ideia.Ideia;
import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "Ideia")
public class Desenho extends Mensagem{
    
    private String tag;
    private Ideia ideia;
}
