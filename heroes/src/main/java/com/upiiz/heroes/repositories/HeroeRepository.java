package com.upiiz.heroes.repositories;

import com.upiiz.heroes.entities.Heroe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroeRepository extends CrudRepository<Heroe, Long> {

}
