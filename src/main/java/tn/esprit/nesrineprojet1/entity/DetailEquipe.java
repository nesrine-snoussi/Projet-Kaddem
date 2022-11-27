package tn.esprit.nesrineprojet1.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DetailEquipe {
    @Id
    private int idDetailEquipe;
    private int salle;
    private String thematique;

    @OneToOne
    Equipe equipe ;
}
