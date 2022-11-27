package tn.esprit.nesrineprojet1.services;

import tn.esprit.nesrineprojet1.entity.Contrat;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public Etudiant addEtudiant(Etudiant e);
    public Etudiant updateEtudiant(Etudiant e) ;
    public Etudiant getById(Integer idEtudiant);
    public List<Etudiant> getAllEtudiant();
    public void removeEtudiant(Integer idEtudiant) ;

    public void assignEtudiantToDepartement (Integer idEtudiant , Integer idDepartement) ;

    public List<Etudiant> getEtudiantsByDepartement (Long idDepartement);

    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);


}
