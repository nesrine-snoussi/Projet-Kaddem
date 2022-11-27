package tn.esprit.nesrineprojet1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.nesrineprojet1.entity.Contrat;

import java.util.Date;
import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {
    int countByArchiveIsFalseAndEtud1NomEAndEtud1PrenomE(String nomE , String prenomE);

    List<Contrat> findContratByArchiveIsFalse();

    List<Contrat> findContratByArchiveIsFalseAndDateFinContrat(Date date ) ;
}
