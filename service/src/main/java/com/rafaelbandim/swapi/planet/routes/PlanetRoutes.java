package com.rafaelbandim.swapi.planet.routes;

import com.rafaelbandim.swapi.planet.service.PlanetService;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PlanetRoutes extends RouteBuilder {

    private PlanetService planetService;

    public PlanetRoutes(PlanetService planetService){
        this.planetService = planetService;
    }


    @Override
    public void configure() throws Exception {
        ProducerTemplate producerTemplate = null;
        from("activemq:get-planet")
                .bean(planetService,"getById");
    }
}
