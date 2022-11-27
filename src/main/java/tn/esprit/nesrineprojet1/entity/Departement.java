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
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepart;
    private String nomDepart;
    @OneToMany(cascade =CascadeType.ALL)
            @JoinColumn(name = "idDepart")
            @JsonIgnoreProperties({"dept"})
    List<Etudiant> etud;

}
