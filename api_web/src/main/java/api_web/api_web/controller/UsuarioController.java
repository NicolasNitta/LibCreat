package api_web.api_web.controller;

import org.springframework.web.bind.annotation.RestController;

import api_web.api_web.model.Usuario;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
/*    private String nickname;
    private String email;
    private String nome;
    private String descricao;
    private long seguidores;
    private String senha; */

@RestController
public class UsuarioController {
    ArrayList<Usuario> listaUsuario = new ArrayList<>();

    public UsuarioController() {
        listaUsuario.add(
                new Usuario("Mickey", "123@gmail.com", "Samu", "123", 123, "123"));
        listaUsuario.add(
                new Usuario("CleitinDoPneu", "job@gmail.com", "Nicolas", "Job", 123, "Job"));
    }

    }

    @GetMapping("/Usuario")
    public String getUsuarioByNick(@PathVariable("nickname") String nickname) {
        return void;
    }

}