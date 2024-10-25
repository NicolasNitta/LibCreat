package api_web.api_web.controller.Desenho;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import api_web.api_web.model.Desenho.DesenhoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequiredArgsConstructor
@RequestMapping("desenho")
public class DesenhoController {

    private final DesenhoService desenhoService;

    @PostMapping
    public DesenhoDTO criarDesenho(@RequestBody DesenhoDTO desenhoDTO) {
        return desenhoService.criarDesenho(desenhoDTO);
    }
    
    @GetMapping
    public List<DesenhoDTO> buscarTodosDesenhos() {
        return desenhoService.buscarTodosDesenhos();
    }
    
    @GetMapping("/{id}")
    public DesenhoDTO buscarPorID(@PathVariable Long id) {
        return desenhoService.buscarPorId(id);
    }
    
    @PutMapping("/{id}")
    public void atualizarDesenho(@PathVariable Long id, @RequestBody DesenhoDTO desenhoDTO) {
        desenhoService.atualizarDesenho(id, desenhoDTO);
    }

    @DeleteMapping("/{id}")
    public void deletarDesenho(@PathVariable Long id){
        desenhoService.deletarDesenho(id);
    }
}
