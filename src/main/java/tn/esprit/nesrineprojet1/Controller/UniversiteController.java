package tn.esprit.nesrineprojet1.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.entity.Universite;
import tn.esprit.nesrineprojet1.services.IDepartementService;
import tn.esprit.nesrineprojet1.services.IUniversiteService;



@RestController
@RequestMapping("universite")
public class UniversiteController {

    @Autowired
    IUniversiteService universiteService;
    @Autowired
     IDepartementService departementService;




    @PostMapping("/addUniver")
    public Universite addUniver(@RequestBody Universite u) {
        return universiteService.adduniver(u);
    }
    @PutMapping("/updateUniver")
    public String updateUniver( @RequestBody Universite u) {
        universiteService.updateUniv(u);
        return "Updated !";
    }

    @DeleteMapping("/deleteUniver/{idUniver}")
    public String removeUniver(@PathVariable Integer idUniver) {
        universiteService.removeUniver(idUniver);
        return "Removed " ;
    }
    @GetMapping("/afficheUniver/{id}")
    public String getById(@PathVariable Integer id) {
        Universite univer = universiteService.getById(id);
        if (null != univer) {
            return "Universite nom : " +univer.getNomUniv();
        } else {
            return "not exists";
        }

    }

   /* @PutMapping("/assign/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement( @PathVariable Integer idUniversite, @PathVariable Integer idDepartement) {
             universiteService.assignUniversiteToDepartement(idUniversite,idDepartement);

    }*/

//    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement){
//        Universite universite=universiteRepository.findById(idUniversite).orElse(null);
//        Departement dept=deptRepository.findById(idDepartement).orElse(null);
//        if(universite !=null && dept!=null){
//            universite.getDepart().add(dept);
//        }
//    }
}
