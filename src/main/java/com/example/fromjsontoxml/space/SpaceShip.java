package com.example.fromjsontoxml.space;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SpaceShip {
    private String name;
    private Integer crew;
    private Double fuel;
}
