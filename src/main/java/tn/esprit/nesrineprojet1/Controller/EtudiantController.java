package tn.esprit.nesrineprojet1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.entity.Etudiant;
import tn.esprit.nesrineprojet1.repositories.DepartementRepository;
import tn.esprit.nesrineprojet1.repositories.EtudiantRepository;
import tn.esprit.nesrineprojet1.services.IEtudiantService;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@RequestMapping("etudiant")
public class EtudiantController  {
    @Autowired //injecte moi un bean qui implémente l interface etudiant service ( injection des dépendances )
    IEtudiantService serviceEtudiant ;

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    DepartementRepository departementRepository;
    @GetMapping("/hello/{classname}")
    public String SayHello(@PathVariable String classname) {
        return "hello" +classname ;
    }
    //localhost:8080


    @GetMapping("/AllEtudiant")
    public List<Etudiant> getAll() {
        List<Etudiant> etudiants = serviceEtudiant.getAllEtudiant();
        return etudiants;
    }


    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return  serviceEtudiant.addEtudiant(e);
   }

    @PutMapping("/updateEtudiant")
    public String updateEtudiant(@RequestBody Etudiant e) {
        serviceEtudiant.updateEtudiant(e);
        return "Updated ! ";
    }

    @DeleteMapping("/removeEtudiant/{id}")
    public String removeEtudiant(@PathVariable Integer id) {
        serviceEtudiant.removeEtudiant(id);
        return "Removed";
    }

    @GetMapping("{id}")
    public String getOne(@PathVariable Integer id) {
        Etudiant etudiant =  serviceEtudiant.getById(id);
        if (null != etudiant) {
            return "hello" +etudiant.getOption();
        } else {
            return "not exists";
        }
    }
    @PostMapping("{idEtudiant}/{idDepartement}")
    public String assignEtudiantToDepartement (@PathVariable Integer idEtudiant , @PathVariable Integer idDepartement) {
        serviceEtudiant.assignEtudiantToDepartement(idEtudiant,idDepartement);
        return "L'etudiant " +idEtudiant + "est ajouter au departement : " +idDepartement  ;
    }

   /* @PutMapping("/etudiantId/departementId")
    public void assignEtudiantToDepartement(@PathVariable Integer etudiantId, @PathVariable Integer departementId) {
        Etudiant etudiant=etudiantRepository.findById(etudiantId).orElse(null);
        Departement dept=departementRepository.findById(departementId).orElse(null);
        //
        if(etudiant!=null && dept!=null){
            etudiant.setDept(dept);
            etudiantRepository.save(etudiant);
        }

    }*/

    @GetMapping ("/getEtudiantsByDepartement/{idDepartement}")
    public List<Etudiant> getEtudiantsByDepartement(@PathParam("idDepartement") Long idDepartement) {
      return      serviceEtudiant.getEtudiantsByDepartement(idDepartement);
    }
}
