package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.Alien;

@Component
public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
