package api_web.api_web.model.Desenho;


import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Table(name = "Desenho")
@Entity

public class Desenho extends Mensagem{
    
    private String tag;
    private Long ideia_id;
}
