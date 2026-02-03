package main.ch10.controllers;

import main.ch10.models.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country c = Country.of("france",403);
        return ResponseEntity.status(HttpStatus.ACCEPTED).header("continent", "Europe").header("capital","paris").body(c);
    }

    @GetMapping("/all")
    public List<Country> countries(){
        Country c1 = Country.of("india",90);
        Country c2 = Country.of("brazil",30);

        return List.of(c1,c2);
    }
}
