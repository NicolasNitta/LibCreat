package api_web.api_web.model.Imagem;

import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Imagem")
public class Imagem extends Mensagem{
    
    private String url;

}
