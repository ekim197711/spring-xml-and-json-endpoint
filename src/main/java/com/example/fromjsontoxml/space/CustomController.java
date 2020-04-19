package com.example.fromjsontoxml.space;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RequestMapping("/api2")
@Slf4j
@RestController
public class CustomController {

    @GetMapping("/oneship")
    public ResponseEntity<String> oneShip(RequestEntity requestEntity) throws JsonProcessingException {
        val entries = requestEntity.getHeaders().entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            log.info("HEADER! " + entry.getKey() + " => " + entry.getValue().get(0));
        }

        val headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_XML_VALUE);
        val mapper = new XmlMapper();
        val ship = new SpaceShip("mike",10,12.0d);
        val s = mapper.writeValueAsString(ship);
//        val s = ship.toString();
        val response = new ResponseEntity<String>(s, headers, HttpStatus.OK);

        return response;
    }
}
