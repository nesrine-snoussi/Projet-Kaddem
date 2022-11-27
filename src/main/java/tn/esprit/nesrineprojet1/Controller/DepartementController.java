package tn.esprit.nesrineprojet1.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.services.IDepartementService;

import java.util.List;

@RestController
@RequestMapping("Departement")
public class DepartementController {
    @Autowired
    IDepartementService departementService;



    @PostMapping("/addDept")
    public Departement addDep ( @RequestBody Departement d ) {return departementService.addDepartement(d);}


    @PutMapping("/updatedept")
    public String updateDept(Departement d) {
        departementService.updateDepartement(d);
        return "Updated ! " ;
    }

    @DeleteMapping("/removeDept/{id}")
    public String removeDept(@PathVariable Integer id) {
        departementService.removeDepart(id);
        return "Removed !" ;
    }
    @GetMapping("/affiche/{id}")
    public String getById (@PathVariable Integer id) {
        Departement dept = departementService.getById(id) ;
        if (null != dept) {
            return " Departement name : " +dept.getNomDepart();
        } else {
            return "not exists";
        }
    }

    @GetMapping("/AllDepartments")
    public List<Departement> getAllDepartments() {
       return departementService.getAllDepartment();
    }




}
