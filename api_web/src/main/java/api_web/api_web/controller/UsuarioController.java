package api_web.api_web.controller;

import org.springframework.web.bind.annotation.RestController;

import api_web.api_web.model.Usuario;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class UsuarioController {

    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
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

        for (Usuario outroUsuario : usuarios) {
            if(email.equals(outroUsuario.getEmail())){
                return false;
            }
        }
        return true;
    }

    public boolean inserirUsuario(Usuario usuario) {
        
        usuarios.add(usuario);

        if(usuarios.get(usuarios.size()).getEmail().equals(usuario.getEmail())){
            return true;
        }

        return false;
    }
    

}