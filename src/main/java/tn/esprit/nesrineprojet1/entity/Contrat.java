package tn.esprit.nesrineprojet1.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Contrat implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int idContrat ;
    @Temporal(TemporalType.DATE)
    Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    Date dateFinContrat ;
    @Enumerated(EnumType.STRING)
    Specialite Specialite ;
    Boolean archive ;

    @ManyToOne(cascade = CascadeType.PERSIST)
    Etudiant etud1;

}
