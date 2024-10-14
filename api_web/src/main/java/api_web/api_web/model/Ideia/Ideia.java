package api_web.api_web.model.Ideia;

import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "Ideia")

public class Ideia extends Mensagem{
    
    private String texto;

}
