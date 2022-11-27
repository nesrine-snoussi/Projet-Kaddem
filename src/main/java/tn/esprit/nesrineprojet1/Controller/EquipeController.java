package tn.esprit.nesrineprojet1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nesrineprojet1.entity.Equipe;
import tn.esprit.nesrineprojet1.services.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("equipe")
public class EquipeController {
    @Autowired
    IEquipeService equipeService ;

    @PostMapping("/addEquipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        return equipeService.addEquipe(e);
    }
    @PutMapping("/updateEquipe")
    public String updateEquipe(Equipe e){
        equipeService.updateEquipe(e);
        return "Updated ! " ;
    }
    @DeleteMapping("/removeEquipe/{id}")
    public String removeEquipe(@PathVariable Integer id) {
        equipeService.removeEquipe(id);
        return "Deleted ! " ;
    }


    @GetMapping("{id}")
    public String getOneEquipe(@PathVariable Integer id) {
        Equipe equipe = equipeService.getById(id);
        if (null != equipe) {
            return "hello" +equipe.getNiveau();
        } else {
            return "not exists";
        }

    }

    public List<Equipe> getAll() {
         List<Equipe> equipes = equipeService.AllEquipes();

         return equipes;
    }


}
