package api_web.api_web.controller.Desenho;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import api_web.api_web.model.Desenho.Desenho;
import api_web.api_web.model.Desenho.DesenhoDTO;
import api_web.api_web.model.Ideia.Ideia;
import api_web.api_web.repository.DesenhoRepository;
import api_web.api_web.repository.IdeiaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DesenhoService {

    private final DesenhoRepository desenhoRepository;
    private final ModelMapper modelMapper;
  //  private IdeiaRepository ideiaRepository;

    public DesenhoDTO criarDesenho(DesenhoDTO dto, Long id_Ideia) {
        Desenho desenho = modelMapper.map(dto, Desenho.class);

    /*   Optional<Ideia> ideiaOpcional = ideiaRepository.findById(id_Ideia);

        if (ideiaOpcional.isPresent()) {
            Ideia ideia = ideiaOpcional.get();
            desenho.setIdeia(ideia);
            desenhoRepository.save(desenho);*/  
            return modelMapper.map(desenho, DesenhoDTO.class);
      //  }
     //   throw new RuntimeException("Ideia não encontrada");

    }

    public List<DesenhoDTO> buscarTodosDesenhos() {
        return desenhoRepository.findAll().stream().map(d -> modelMapper.map(d, DesenhoDTO.class)).collect(Collectors.toList());
        
    }

    public DesenhoDTO buscarPorId(Long id) {
        Desenho desenho = desenhoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return modelMapper.map(desenho, DesenhoDTO.class);
    }

    public DesenhoDTO atualizarDesenho(Long id, DesenhoDTO desenhoDTO) {
        Desenho desenho = modelMapper.map(desenhoDTO, Desenho.class);
        desenho.setIdMensagem(id);
        desenhoRepository.save(desenho);
        return modelMapper.map(desenho, DesenhoDTO.class);
    }

    public void deletarDesenho(Long id) {
       desenhoRepository.deleteById(id);
    }

}
