package tn.esprit.nesrineprojet1.repositories;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.nesrineprojet1.entity.Departement;
import tn.esprit.nesrineprojet1.entity.Universite;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement , Integer> {


   //@Query(Select u From Universite u WHERE u.departement)
  //public  List<Departement> findDepartementByUniversite(Integer idUniversite ) ;

}
