package api_web.api_web.model;

import lombok.Data;

@Data

public class Usuario {

    private String nickname;
    private String email;
    private String nome;
    private String descricao;
    private long seguidores;
    private String senha;
    
    public Usuario(String nickname, String email, String nome, String descricao, long seguidores, String senha) {
        this.nickname = nickname;
        this.email = email;
        this.nome = nome;
        this.descricao = descricao;
        this.seguidores = seguidores;
        this.senha = senha;
    }

}
