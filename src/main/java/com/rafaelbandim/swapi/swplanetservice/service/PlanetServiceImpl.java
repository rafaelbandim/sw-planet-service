package com.rafaelbandim.swapi.swplanetservice.service;

import com.rafaelbandim.swapi.swplanetservice.entity.Planet;
import com.rafaelbandim.swapi.swplanetservice.repository.PlanetRepository;
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
}
