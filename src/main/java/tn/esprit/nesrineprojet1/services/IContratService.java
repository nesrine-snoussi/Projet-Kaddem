package tn.esprit.nesrineprojet1.services;

import tn.esprit.nesrineprojet1.entity.Contrat;

import java.util.List;

public interface IContratService {
    public Contrat addContrat(Contrat c);

    public  Contrat updateContrat(Contrat c) ;

    public void removeContrat(Integer idContrat);

    public Contrat getById(Integer idContrat) ;

    public List<Contrat> AllContrats() ;

    public Contrat affectContratToEtudiant (Contrat ce, String nomE, String prenomE);

    public void retrieveAndUpdateStatusContrat() ;
}
