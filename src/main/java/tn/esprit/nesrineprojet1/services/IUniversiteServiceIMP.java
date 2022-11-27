package tn.esprit.nesrineprojet1.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.entity.Universite;
import tn.esprit.nesrineprojet1.repositories.DepartementRepository;
import tn.esprit.nesrineprojet1.repositories.UniversiteRepository;

import java.util.List;

@Service
public class IUniversiteServiceIMP implements IUniversiteService {

    @Autowired
    UniversiteRepository universiteRepository;

    @Autowired
    DepartementRepository departementRepository;

    public Universite adduniver(Universite u) { return universiteRepository.save(u);}

    public Universite updateUniv(Universite u) {
        return universiteRepository.save(u);
    }

    public Universite getById(Integer idUniver) {return universiteRepository.findById(idUniver).orElse(null);}

    public List<Universite> getAllUniver() {return null;}

    public void removeUniver(Integer idUniver) {
        universiteRepository.deleteById(idUniver);
    }


    public void assignUniversiteToDepartement(Integer idUniversite, Integer
            idDepartement) {

        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);

        if(universite !=null && departement !=null) {
            universite.getDept().add(departement);

            universiteRepository.save(universite);
        }


    }

   /* public  List<Departement> findDepartByUnversite(Integer idUniv) {
     return universiteRepository.findByIdUniv(idUniv);


    }*/

   /* public void assignUniversityToDepartment (Integer idDepartment , Integer idUniver) {
        //1 Récuperation
        Universite universite = universiteRepository.findById(idUniver).orElse(null);
        List<Departement> depts = departementRepository.getAll() ;
        //2 traitement
        if (universite!=null && departement!=null) {
            universite.setDept(departement);
            universiteRepository.save(universite) ;
        }
    }*/
}
