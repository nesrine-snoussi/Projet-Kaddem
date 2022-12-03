package tn.esprit.nesrineprojet1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nesrineprojet1.entity.Contrat;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.entity.Equipe;
import tn.esprit.nesrineprojet1.entity.Etudiant;

import tn.esprit.nesrineprojet1.repositories.ContratRepository;
import tn.esprit.nesrineprojet1.repositories.DepartementRepository;
import tn.esprit.nesrineprojet1.repositories.EquipeRepository;
import tn.esprit.nesrineprojet1.repositories.EtudiantRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service //pour créer une instance(bean) de cette classe
public class IEtudiantServiceIMP implements IEtudiantService{
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    DepartementRepository departementRepository;

    @Autowired
    EquipeRepository equipeRepository ;
    @Autowired
    ContratRepository contratRepository ;
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {

        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant getById(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }

    public void assignEtudiantToDepartement (Integer idEtudiant , Integer idDepartement) {

        //1 Recupértion
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        //2Traitement
        if (etudiant!=null && departement!=null) {
            etudiant.setDept(departement);
            //3 save
            etudiantRepository.save(etudiant);

        }

    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Long idDepartement) {
        return etudiantRepository.findAllEtudiantsByDepartement(idDepartement);
    }
    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
//        List<Etudiant>etudiants=etudiantRepository.findAll();
//        List<Equipe>eq =new ArrayList<>();
//        List<Contrat>ce=new ArrayList<>();
//        for(Etudiant etud: etudiants)
//
//        {
//            etud=e;
//            if(etud != null) {
//                Equipe eq2= equipeRepository.findById(idEquipe).orElse(null);
//                Contrat con1=contratRepository.findById(idContrat).orElse(null);
//                eq.add(eq2);
//                ce.add(con1);
//                etud.setEquipe(eq);
//                return etud;
//            }
//        }
// --------------------------------------------------------------------------------------------------------------------------------------
//--> hedhi kif tabda eli relation gérer par l'equipe
//        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
//        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
//        if (contrat != null && equipe != null ) {
//            Etudiant etudiant =   etudiantRepository.save(e) ;
//
//            //affectation 1
//            contrat.setEtud1(etudiant);
//           // contratRepository.save(contrat);
//
//            //affectation 2
//            equipe.getEtudiants().add(etudiant);
//            //equipeRepository.save(equipe); badalneha b @Transactional
//------------------------------------------------------------------------------------------------------------------------------------
// -->  kif yabda el etudiant qui gere la relation
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        if (contrat != null && equipe != null ){
            Etudiant etudiant =   etudiantRepository.save(e) ;
            if (etudiant.getEquipe() != null ) {
                etudiant.getEquipe().add(equipe);



        }
            else {
                List<Equipe> equipes = new ArrayList<Equipe>() ;
                equipes.add(equipe) ;
                etudiant.setEquipe(equipes);
                return  etudiant ;
            }
        }


        return null;

    }


}
