package com.example.fromjsontoxml.space;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class SpaceStation {
    private String name;
    @JacksonXmlElementWrapper(localName = "spaceshipList")
    @JacksonXmlProperty(localName = "coolSpaceship")
    private List<SpaceShip> spaceShips = new ArrayList<>();

}
