package api_web.api_web.model.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "usuario")

@Entity
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_Usuario;

    private String nickname;
    
    private String email;
    
    private String nome;
    
    private String descricao;
    
    private Long seguidores;
    
    private String senha;


}
