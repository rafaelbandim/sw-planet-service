package com.rafaelbandim.swapi.planet.service;

import com.rafaelbandim.swapi.planet.PlanetDTO;
import com.rafaelbandim.swapi.planet.entity.Planet;
import com.rafaelbandim.swapi.planet.repository.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class PlanetServiceImpl implements PlanetService {
    private PlanetRepository planetRepository;

    public PlanetServiceImpl(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @Override
    public List<Planet> getAll() {
        return planetRepository.findAll();
    }

    @Override
    public PlanetDTO getById(Long id) {
        Planet planet = planetRepository.getById(id);
        return new PlanetDTO(planet.getId(), planet.getName());
    }
}
