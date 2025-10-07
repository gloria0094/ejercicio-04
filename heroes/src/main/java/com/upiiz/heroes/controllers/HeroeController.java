package com.upiiz.heroes.controllers;

import com.upiiz.heroes.entities.Heroe;
import com.upiiz.heroes.repositories.HeroeRepository;
import com.upiiz.heroes.services.HeroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HeroeController {
    private final HeroeRepository heroeRepository;
    private final HeroeService heroeService;

    public HeroeController(HeroeRepository heroeRepository, HeroeService heroeService) {
        this.heroeRepository = heroeRepository;
        this.heroeService = heroeService;
    }

    @GetMapping("/marvel/socios/v1/heroes")
    public ResponseEntity<List<Heroe>> getHeroes() {
        return ResponseEntity.ok(heroeService.getAllHeroes());
    }

    @GetMapping("/marvel/socios/v1/heroes/{id}")
    public ResponseEntity<Heroe> getHeroe(@PathVariable Long id) {
        return ResponseEntity.ok(heroeService.getHeroeById(id));
    }

    @PostMapping("/marvel/socios/v1/heroes")
    public ResponseEntity<Heroe> createHeroe(@RequestBody Heroe heroe) {
        return ResponseEntity.status(HttpStatus.CREATED).body(heroeService.addHeroe(heroe));
        //return ResponseEntity.ok(heroeService.addHeroe(heroe));
    }

    @PutMapping("/marvel/socios/v1/heroes/{id}")
    public ResponseEntity<Heroe> updateHeroe(@PathVariable Long id, @RequestBody Heroe heroe) {
        heroe.setId(id);
        return ResponseEntity.ok(heroeService.updateHeroe(heroe));
    }

    @DeleteMapping("/marvel/socios/v1/heroes/{id}")
    public ResponseEntity<Void> deleteHeroe(@PathVariable Long id) {
        heroeService.deleteHeroe(id);
        return ResponseEntity.noContent().build();
    }

}
