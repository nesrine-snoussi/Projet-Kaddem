package tn.esprit.nesrineprojet1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nesrineprojet1.entity.Equipe;

import tn.esprit.nesrineprojet1.repositories.EquipeRepository;

import java.util.List;

@Service
public class IEquipeServiceIMP implements IEquipeService{
    @Autowired
    EquipeRepository equipeRepository;

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }



    @Override
    public List<Equipe> AllEquipes() {
        return null;
    }

    @Override
    public void removeEquipe(Integer idEquipe) {
        equipeRepository.deleteById(idEquipe);
    }

    @Override
    public Equipe getById(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).orElse(null);
    }


}
