package api_web.api_web.controller.Imagem;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import api_web.api_web.model.Imagem.Imagem;
import api_web.api_web.model.Imagem.ImagemDTO;
import api_web.api_web.model.Usuario.UsuarioDTO;
import api_web.api_web.repository.ImagemRepository;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'BuscandoPorId'");
    }

    public ImagemDTO atualizaImagem(Long id, ImagemDTO imgDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizaImagem'");
    }

    public void deletaImagem(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletaImagem'");
    }


}
