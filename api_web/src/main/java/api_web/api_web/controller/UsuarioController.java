package api_web.api_web.controller;

import org.springframework.web.bind.annotation.RestController;

import api_web.api_web.model.Usuario;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import api_web.api_web.model.Usuario;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



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

    
    @PostMapping("/usuario")
    public String InserirUsuario(@RequestBody Usuario usuario) {
        
        //Verificação de email
        if(!verificaEmail(usuario.getEmail()))
            return "Email inválido";

        //tenta inserir Usuario no bdd
        for (int i = 0; i < 3; i++) {
            if(inserirUsuario(usuario))
                return "Usuário inserido";
        }

        //mensagem de erro do servidor
        return "Usuário não criado. Erro na inserção";

    }

    public boolean verificaEmail(String email){

        for (Usuario outroUsuario : listaUsuario) {
            if(email.equals(outroUsuario.getEmail())){
                return false;
            }
        }
        return true;
    }

    public boolean inserirUsuario(Usuario usuario) {
        
        listaUsuario.add(usuario);

        if(listaUsuario.get(listaUsuario.size()).getEmail().equals(usuario.getEmail())){
            return true;
        }

        return false;
    }
    

}