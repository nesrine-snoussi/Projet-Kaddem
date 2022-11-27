package tn.esprit.nesrineprojet1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nesrineprojet1.entity.DetailEquipe;
import tn.esprit.nesrineprojet1.repositories.DepartementRepository;
import tn.esprit.nesrineprojet1.repositories.DetailEquipeRepository;

import java.util.List;

@Service
public class IDetailEquipeServiceImp implements IDetailEquipeService{
    @Autowired
    DetailEquipeRepository detailEquipeRepository;

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe detailEquipe) {
        return detailEquipeRepository.save(detailEquipe);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe detailEquipe) {
        return detailEquipeRepository.save(detailEquipe);
    }

    @Override
    public DetailEquipe getById(int idDetailEquipe) {
        return detailEquipeRepository.findById(idDetailEquipe).orElse(null);
    }

    @Override
    public void removeDetailEquipe(int idDetailEquipe) {
        detailEquipeRepository.deleteById(idDetailEquipe);

    }

    @Override
    public List<DetailEquipe> getAllDetails() {
        return detailEquipeRepository.findAll();
    }
}
