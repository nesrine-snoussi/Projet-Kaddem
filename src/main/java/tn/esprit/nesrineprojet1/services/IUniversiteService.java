package tn.esprit.nesrineprojet1.services;

import tn.esprit.nesrineprojet1.entity.Universite;

import java.util.List;


public interface IUniversiteService {

    public Universite adduniver(Universite u);
    public Universite updateUniv(Universite u);

    public Universite getById(Integer idUniver);

    public List<Universite> getAllUniver();

    public void removeUniver(Integer idUniver);

    public  void assignUniversiteToDepartement(Integer idUniversite, Integer
            idDepartement) ;
}
