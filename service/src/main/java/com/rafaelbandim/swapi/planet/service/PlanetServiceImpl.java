package com.rafaelbandim.swapi.planet.service;

import com.rafaelbandim.swapi.entity.Planet;
import com.rafaelbandim.swapi.repository.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class PlanetServiceImpl implements PlanetService{
    private PlanetRepository planetRepository;

    public PlanetServiceImpl(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @Override
    public List<Planet> getAll() {
        return planetRepository.findAll();
    }

    @Override
    public Planet getById(Long id) {
        Planet planet = planetRepository.getById(id);
        System.out.println(planet.getId());
        return planet;
    }
}
