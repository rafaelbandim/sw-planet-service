package com.rafaelbandim.swapi.planet.service;

import com.rafaelbandim.swapi.entity.Planet;

import java.util.List;

public interface PlanetService {

    List<Planet> getAll();

    Planet getById(Long id);
}
