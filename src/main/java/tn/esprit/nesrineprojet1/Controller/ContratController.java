package tn.esprit.nesrineprojet1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nesrineprojet1.entity.Contrat;
import tn.esprit.nesrineprojet1.services.IContratService;

import java.util.List;
@RestController
@RequestMapping("/contrat")
public class ContratController {
    @Autowired
    IContratService contratService;

    @PostMapping("/addContrat")
    public Contrat addContrat (@RequestBody Contrat c) {return contratService.addContrat(c);}

    @PutMapping("/updateContrat")
    public Contrat updateContrat (@RequestBody Contrat c) {
       return  contratService.updateContrat(c);

    }
    @DeleteMapping("/removeContrat/{id}")
    public String removeContrat(@PathVariable Integer id){
        contratService.removeContrat(id);
        return "Removed !" ;
    }

    @GetMapping("/AllContrat")
    public List<Contrat> getAll() {
        List<Contrat> contrats = contratService.AllContrats() ;
        return contrats;
    }
   @GetMapping("/{id}")
    public String getOne (@PathVariable Integer id) {
        Contrat contrat = contratService.getById(id);
        if (null!= contrat) {
            return "The contract will expire on : " +contrat.getDateFinContrat();
        }
        else {
            return "No Contrat Found ! " ;
        }

    }



}
