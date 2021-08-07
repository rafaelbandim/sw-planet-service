package com.rafaelbandim.swapi.planet.repository;

import com.rafaelbandim.swapi.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

}
