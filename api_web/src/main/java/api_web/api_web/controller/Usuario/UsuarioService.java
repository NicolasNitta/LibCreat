package api_web.api_web.controller.Usuario;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import api_web.api_web.model.Usuario.Usuario;
import api_web.api_web.model.Usuario.UsuarioDTO;
import api_web.api_web.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    public UsuarioDTO criarUsuario(UsuarioDTO userDTO){
        Usuario usuario = modelMapper.map(userDTO, Usuario.class);
        usuarioRepository.save(usuario);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    public List<UsuarioDTO> buscarTodosUsuarios(){
        return usuarioRepository.findAll().stream().map(u -> modelMapper.map(u, UsuarioDTO.class)).collect(Collectors.toList());

    }
}


