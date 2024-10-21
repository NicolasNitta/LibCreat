package api_web.api_web.model.Ideia;

import java.util.List;

import api_web.api_web.model.Desenho.Desenho;
import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table (name = "Ideia")
@Entity


public class Ideia extends Mensagem{
    
  
    private String texto;

   
    @OneToMany (mappedBy = "ideia")
    private List<Desenho> desenho;

}
