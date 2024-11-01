package api_web.api_web.model.Usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioDTO {
    
    private String nickname;
    private String email;
    private String nome;
    private String descricao;
    private int seguidores;
    private String senha;


}
