package api_web.api_web.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {

    private String nickname;
    private String email;
    private String nome;
    private String descricao;
    private long seguidores;
    private String senha;


}
