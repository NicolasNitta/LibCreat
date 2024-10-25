package api_web.api_web.controller.Ideia;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import api_web.api_web.model.Ideia.Ideia;
import api_web.api_web.model.Ideia.IdeiaDTO;
import api_web.api_web.repository.IdeiaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class IdeiaService {

    private final IdeiaRepository ideiaRepository;
    
    private final ModelMapper modelMapper;

    public IdeiaDTO criarIdeia(IdeiaDTO ideiaDTO) {
       
        Ideia ideia = modelMapper.map(ideiaDTO, Ideia.class);
        ideiaRepository.save(ideia);
        return modelMapper.map(ideia, IdeiaDTO.class); 
    }

    public List<IdeiaDTO> buscarIdeias() {
        return ideiaRepository.findAll().stream().map(i -> modelMapper.map(i, IdeiaDTO.class)).collect(Collectors.toList());
    }

    public IdeiaDTO buscarIdeiaID(Long id) {
        Ideia ideia = ideiaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return modelMapper.map(ideia, IdeiaDTO.class);
    }

    public IdeiaDTO atualizarIdeia(IdeiaDTO ideiaDTO, Long id) {
        Ideia ideia = modelMapper.map(ideiaDTO, Ideia.class);
        ideia.setIdMensagem(id);
        ideiaRepository.save(ideia);
        return modelMapper.map(ideia, IdeiaDTO.class);
    }

    public void deleterIdeia(Long id) {
        ideiaRepository.deleteById(id);
    }


}
