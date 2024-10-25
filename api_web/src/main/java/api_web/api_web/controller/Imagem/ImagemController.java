package api_web.api_web.controller.Imagem;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api_web.api_web.model.Imagem.ImagemDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/imagem")

public class ImagemController {
    
     private final ImagemService imgService;

    @PostMapping
    public void cadastrarImagem(@RequestBody ImagemDTO imgDTO) {
        imgService.criarImagem(imgDTO);
    }

    @GetMapping
    public List<ImagemDTO> buscarImagem() {
        return imgService.buscarTodasImagens();
    }

    @GetMapping("/{id}")
    public ImagemDTO BuscandoPorId(@PathVariable Long id) {
        return imgService.BuscandoPorId(id);
    }
    @PutMapping("/{id}")
    public ImagemDTO atualizaUsuario(@PathVariable Long id, @RequestBody ImagemDTO imgDTO) {
        return imgService.atualizaImagem(id, imgDTO);
    }
    @DeleteMapping("/{id}")
    
    public void deletaImagem(@PathVariable Long id){
        imgService.deletaImagem(id);
    }

}
