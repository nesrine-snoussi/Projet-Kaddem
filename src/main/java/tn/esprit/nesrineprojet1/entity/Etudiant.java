package tn.esprit.nesrineprojet1.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
    private String pwd;
    @Transient
    private String confirmpwd;
    @ManyToOne
            @JoinColumn(name = "idDepart")

    Departement dept;
    @OneToMany(mappedBy = "etud1")
    List<Contrat> contrats;
    @ManyToMany
    List<Equipe> equipe;


}
