package api_web.api_web.model.Desenho;

import org.hibernate.annotations.ManyToAny;

import api_web.api_web.model.Ideia.Ideia;
import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

    @ManyToOne
    private Ideia ideia;

}
