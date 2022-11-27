package tn.esprit.nesrineprojet1.services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.entity.Universite;
import tn.esprit.nesrineprojet1.repositories.DepartementRepository;
import tn.esprit.nesrineprojet1.repositories.UniversiteRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class IDepartementServiceIMP implements IDepartementService {
   private final  DepartementRepository departementRepository;

   private final UniversiteRepository universiteRepository ;

    public Departement addDepartement(Departement d ) {return departementRepository.save(d);}

    public Departement updateDepartement(Departement d) {return departementRepository.save(d);}

    public Departement getById(Integer idDepart) {return departementRepository.findById(idDepart).orElse(null);}

    public void removeDepart(Integer idDepart) {
        departementRepository.deleteById(idDepart);
    }

    public List<Departement> getAllDepartment() { return departementRepository.findAll() ;}

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        return null;
    }

   /* public List<Departement> findDepartByUnversite(Integer idUniv) {

        Universite universite = universiteRepository.findById(idUniv).orElse(null);
        if (universite!= null) {
          return   universite.getDept();
        }
        return null ;

    }*/
}
