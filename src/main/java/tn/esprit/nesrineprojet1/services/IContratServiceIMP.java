package tn.esprit.nesrineprojet1.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.nesrineprojet1.entity.Contrat;
import tn.esprit.nesrineprojet1.entity.Etudiant;
import tn.esprit.nesrineprojet1.repositories.ContratRepository;
import tn.esprit.nesrineprojet1.repositories.EtudiantRepository;
import tn.esprit.nesrineprojet1.utils.HelperClass;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class IContratServiceIMP implements IContratService{

    @Autowired
    ContratRepository contratRepository;
    EtudiantRepository etudiantRepository ;
    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    public Contrat updateContrat(Contrat c ) { return contratRepository.save(c); }

    public void removeContrat(Integer idContrat) {
        contratRepository.deleteById(idContrat);
    }

    public Contrat getById(Integer idContrat){return contratRepository.findById(idContrat).orElse(null);}

    public List<Contrat> AllContrats(){
        return null;
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
//        Etudiant etudiant = etudiantRepository.findEtudiantByNomEAndPrenomE(nomE, prenomE);
//        if (etudiant != null && ce!= null && etudiant.getContrats().size()<5 ) {
//            ce.setEtud1(etudiant);
//            contratRepository.save(ce);
//        }





//        if (etudiant != null && etudiant.getContrats().size()<5 && ce != null ) {
//            if (!ce.getArchive()) {
//                ce.setEtud1(etudiant);
//                contratRepository.save(ce);
//
//            }
//        }
//

        //-----------------------------------------------------------------------------------------------
        Etudiant etudiant = etudiantRepository.findEtudiantByNomEAndPrenomE(nomE , prenomE) ;

//        int nbContratActifs = contratRepository.countByArchiveIsFalseAndEtud1NomEAndEtud1PrenomE(nomE, prenomE);
//        if (nbContratActifs )


       return  null    ;
    }

    public void archiveContrats() {
        contratRepository.findContratByArchiveIsFalseAndDateFinContrat()
    }

    @Scheduled(fixedRate = "60000")
    @Override
    public void retrieveAndUpdateStatusContrat()² {
        List<Contrat> contrats = contratRepository.findContratByArchiveIsFalse();
        contrats.stream().filter(contrat -> HelperClass.computeDifferenceBetweenDateInDays(new Date(), contrat.getDateFinContrat())<16)
                .forEach(contrat -> log.info("Contrat de l'etudiant" + contrat.getEtud1().getNomE())) ;

    }


}
