package com.rafaelbandim.swapi.swplanetservice.service;

import com.rafaelbandim.swapi.swplanetservice.entity.Planet;

import java.util.List;

public interface PlanetService {

    List<Planet> getAll();
}
