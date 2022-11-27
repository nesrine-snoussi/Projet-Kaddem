package tn.esprit.nesrineprojet1.services;

import tn.esprit.nesrineprojet1.entity.Departement;

import java.util.List;

public interface IDepartementService {

    public Departement addDepartement(Departement d );

    public Departement updateDepartement(Departement d) ;
    public Departement getById(Integer idDepart) ;

    public void removeDepart(Integer idDepart);
    public List<Departement> getAllDepartment();

    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) ;


}
