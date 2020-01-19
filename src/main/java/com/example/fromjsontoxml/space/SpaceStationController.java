package com.example.fromjsontoxml.space;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class SpaceStationController {

    @GetMapping(value= "/stationxml", produces = {MediaType.APPLICATION_XML_VALUE})
    public SpaceStation stationxml(){
        return data();
    }

    @GetMapping(value= "/stationjson", produces = MediaType.APPLICATION_JSON_VALUE)
    public SpaceStation stationjson(){
        return data();
    }


    @GetMapping(value= "/stationboth", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public SpaceStation stationboth(){
        return data();
    }

    private SpaceStation data() {
        SpaceStation spaceStation = new SpaceStation();
        spaceStation.setName("Mikes spacestation");
        spaceStation.getSpaceShips().add(new SpaceShip("Round", 10, 10d));
        spaceStation.getSpaceShips().add(new SpaceShip("Cube", 50, 20d));
        spaceStation.getSpaceShips().add(new SpaceShip("Pyramid", 40, 30d));
        spaceStation.getSpaceShips().add(new SpaceShip("Fluffy", 30, 40d));
        spaceStation.getSpaceShips().add(new SpaceShip("Fast", 20, 50d));
        return spaceStation;
    }


}
