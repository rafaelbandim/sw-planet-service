package com.rafaelbandim.swapi.swplanetservice.repository;

import com.rafaelbandim.swapi.swplanetservice.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

}
