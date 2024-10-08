package api_web.api_web.controller.Usuario;

import org.springframework.web.bind.annotation.RestController;

import api_web.api_web.model.Usuario.Usuario;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UsuarioController {

    ArrayList<Usuario> listaUsuario = new ArrayList<>();

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