package api_web.api_web.controller.Usuario;

import org.springframework.web.bind.annotation.RestController;

import api_web.api_web.model.Usuario.UsuarioDTO;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public void cadastrarUsuario(@RequestBody UsuarioDTO userDTO) {
            usuarioService.criarUsuario(userDTO);
    }

    @GetMapping
    public List<UsuarioDTO> BuscarUsuarios() {
        return usuarioService.buscarTodosUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioDTO BuscandoPorId(@PathVariable Long id) {
        return usuarioService.BuscandoPorId(id);
    }
    
    
    
}