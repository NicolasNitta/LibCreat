package api_web.api_web.controller.Imagem;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import api_web.api_web.model.Imagem.Imagem;
import api_web.api_web.model.Imagem.ImagemDTO;
import api_web.api_web.repository.ImagemRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ImagemService {
    
    private final ModelMapper modelMapper;

    private final ImagemRepository imgRepository;

    public ImagemDTO criarImagem(ImagemDTO imgDTO) {
        Imagem img = modelMapper.map(imgDTO, Imagem.class);

        imgRepository.save(img);

        return modelMapper.map(img, ImagemDTO.class);

    }

    public List<ImagemDTO> buscarTodasImagens() {

        return imgRepository.findAll().stream().map(i -> modelMapper.map(i, ImagemDTO.class)).collect(Collectors.toList());
    }

    public ImagemDTO BuscandoPorId(Long id) {
        Imagem imagem = imgRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return modelMapper.map(imagem, ImagemDTO.class);
    }

    public ImagemDTO atualizaImagem(Long id, ImagemDTO imgDTO) {
        Imagem imagem = modelMapper.map(imgDTO, Imagem.class);
        imagem.setIdMensagem(id);
        imgRepository.save(imagem);
        return modelMapper.map(imagem, ImagemDTO.class);
    }

    public void deletaImagem(Long id) {
        imgRepository.deleteById(id);
    }


}
