package tn.esprit.nesrineprojet1.services;

import tn.esprit.nesrineprojet1.entity.DetailEquipe;


import java.util.List;

public interface IDetailEquipeService {
    public DetailEquipe addDetailEquipe(DetailEquipe detailEquipe );

    public DetailEquipe updateDetailEquipe(DetailEquipe detailEquipe) ;
    public DetailEquipe getById(int idDetailEquipe) ;

    public void removeDetailEquipe(int idDetailEquipe);
    public List<DetailEquipe> getAllDetails();
}
