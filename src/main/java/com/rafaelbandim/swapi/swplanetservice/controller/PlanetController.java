package com.rafaelbandim.swapi.swplanetservice.controller;

import com.rafaelbandim.swapi.swplanetservice.entity.Planet;
import com.rafaelbandim.swapi.swplanetservice.service.PlanetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/planets")
public class PlanetController {
    private PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    @GetMapping
    public ResponseEntity<List<Planet>> getAll(){
        return ResponseEntity.ok(planetService.getAll());
    }


}
