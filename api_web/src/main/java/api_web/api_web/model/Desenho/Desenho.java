package api_web.api_web.model.Desenho;

import api_web.api_web.model.Ideia.Ideia;
import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Table(name = "Desenho")
@Entity

public class Desenho extends Mensagem{
    
    private String tag;

  //  @ManyToOne
  //  @JoinColumn(name = "id_ideia", nullable = false)
  //  private Ideia ideia;

}
