package tn.esprit.nesrineprojet1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.entity.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

    @Query(value = "SELECT * FROM Etudiant e WHERE e.id_depart= 2 " , nativeQuery = true)
    List<Etudiant> findAllEtudiantsByDepartement(Long  idDepartement);

    Etudiant findEtudiantByNomEAndPrenomE(String nomE , String prenomE);
}
