package tn.esprit.nesrineprojet1.services;

import tn.esprit.nesrineprojet1.entity.Equipe;

import java.util.List;

public interface IEquipeService {
    public Equipe addEquipe(Equipe e);
    public Equipe updateEquipe (Equipe e);
    public void removeEquipe (Integer idEquipe);
    public List<Equipe> AllEquipes();
    public Equipe getById (Integer idEquipe);
}
