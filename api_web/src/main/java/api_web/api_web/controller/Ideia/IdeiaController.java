package api_web.api_web.controller.Ideia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api_web.api_web.model.Ideia.IdeiaDTO;
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
@RequestMapping("/ideia")

public class IdeiaController {

    private final IdeiaService ideiaService;

    @PostMapping
    public void criandoIdeia(@RequestBody IdeiaDTO ideiaDTO) {        
        ideiaService.criarIdeia(ideiaDTO);
    }

    @GetMapping
    public List<IdeiaDTO> buscarIdeias() {
        return ideiaService.buscarIdeias();
    }

    @GetMapping("/{id}")
    public IdeiaDTO buscarIdeiaID(@PathVariable Long id) {
        return ideiaService.buscarIdeiaID(id);
    }

    @PutMapping("/{id}")
    public IdeiaDTO atualizarIdeia(@RequestBody IdeiaDTO ideiaDTO, @PathVariable Long id){        
        return ideiaService.atualizarIdeia(ideiaDTO, id);
    }

    @DeleteMapping("/{id}")
    public void deleterIdeia(@PathVariable Long id){
        ideiaService.deleterIdeia(id);
    }    
    
    
    

}
