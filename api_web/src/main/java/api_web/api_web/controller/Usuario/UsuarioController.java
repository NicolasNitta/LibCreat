package api_web.api_web.controller.Usuario;

import org.springframework.web.bind.annotation.RestController;

import api_web.api_web.model.Usuario.UsuarioDTO;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping ("post")
    public void cadastrarUsuario(@RequestBody UsuarioDTO userDTO) {
            usuarioService.criarUsuario(userDTO);
    }

    @GetMapping ("get")
    public List<UsuarioDTO> BuscarUsuarios() {
        return usuarioService.buscarTodosUsuarios();
    }
    
    
}