package com.rafaelbandim.swapi.planet.service;

import com.rafaelbandim.swapi.planet.PlanetServiceJMSApi;
import com.rafaelbandim.swapi.planet.entity.Planet;

import java.util.List;

public interface PlanetService extends PlanetServiceJMSApi {

    List<Planet> getAll();

}
