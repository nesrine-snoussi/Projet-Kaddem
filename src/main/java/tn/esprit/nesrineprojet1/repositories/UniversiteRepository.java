package tn.esprit.nesrineprojet1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.entity.Universite;

import java.util.List;


public interface UniversiteRepository extends JpaRepository<Universite ,Integer> {



}
