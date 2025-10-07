package com.upiiz.heroes.services;

import com.upiiz.heroes.entities.Heroe;
import com.upiiz.heroes.repositories.HeroeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroeService {
    private HeroeRepository heroeRepository;


    //Constructor - Bean
    public HeroeService(HeroeRepository heroeRepository) {
        this.heroeRepository = heroeRepository;
    }

    public List<Heroe> getAllHeroes() {
        return (List<Heroe>) heroeRepository.findAll();
    }

    public Heroe getHeroeById(Long id) {
        return heroeRepository.findById(id).orElse(null);
    }

    public Heroe addHeroe(Heroe heroe) {
        return heroeRepository.save(heroe);
    }

    public void deleteHeroe(Long id) {
        heroeRepository.deleteById(id);
    }

    public Heroe updateHeroe(Heroe heroe) {
        return heroeRepository.save(heroe);
    }
}
