package api_web.api_web.controller.Usuario;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import api_web.api_web.model.Usuario.Usuario;
import api_web.api_web.model.Usuario.UsuarioDTO;
import api_web.api_web.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public UsuarioDTO BuscandoPorId(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    public UsuarioDTO atualizaUsuario(Long id, UsuarioDTO usuarioDTO){
        Usuario usuario = modelMapper.map(usuarioDTO, Usuario.class);
        usuario.setId_Usuario(id);
        usuarioRepository.save(usuario);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    public void deletaUsuario(Long id) {

        usuarioRepository.deleteById(id);
    }
}


