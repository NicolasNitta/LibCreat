package api_web.api_web.controller;

import org.springframework.web.bind.annotation.RestController;

import api_web.api_web.model.Usuario;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UsuarioController {

    ArrayList<Usuario> listaUsuario = new ArrayList<>();

    public UsuarioController() {
        listaUsuario.add(
                new Usuario("Mickey", "123@gmail.com", "Samu", "123", 123, "123"));
        listaUsuario.add(
                new Usuario("CleitinDoPneu", "job@gmail.com", "Nicolas", "Job", 123, "Job"));

    }

    @GetMapping("/Usuario/{nickname}")
    public Usuario getUsuarioByNick(@PathVariable("nickname") String nickname) {

    for (Usuario newUser : listaUsuario) {
        if(newUser.getNickname().equals(nickname)){
            return newUser;
            }
        }
    return null;


    }

}