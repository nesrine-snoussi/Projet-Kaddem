package tn.esprit.nesrineprojet1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nesrineprojet1.entity.DetailEquipe;
import tn.esprit.nesrineprojet1.entity.Equipe;
import tn.esprit.nesrineprojet1.services.IDetailEquipeService;

import java.util.List;

@RestController
@RequestMapping("detailsEquipe")
public class DetailEquipeController {
    @Autowired
    IDetailEquipeService detailEquipeService ;
    
    @PostMapping("/addDetailEquipe")
    public DetailEquipe addDetailEquipe(@RequestBody DetailEquipe de) {
        return detailEquipeService.addDetailEquipe(de);
    }
    
    @PutMapping("/updateDetailEquipe")
    public String updateDetailEquipe(@RequestBody DetailEquipe de){
        detailEquipeService.updateDetailEquipe(de);
        return "Updated ! " ;
    }
    
    @DeleteMapping("/removeDetailEquipe/{id}")
    public String removeDetailEquipe(@PathVariable Integer id) {
        detailEquipeService.removeDetailEquipe(id);
        return "Deleted ! " ;
    }


    @GetMapping("{id}")
    public String getOneEquipe(@PathVariable Integer id) {
        DetailEquipe detailEquipe = detailEquipeService.getById(id);
        if (null != detailEquipe) {
            return "hello" +detailEquipe.getThematique();
        } else {
            return "not exists";
        }

    }

    public List<DetailEquipe> getAll() {
        List<DetailEquipe> detailEquipes = detailEquipeService.getAllDetails();

        return detailEquipes;
    }
}
