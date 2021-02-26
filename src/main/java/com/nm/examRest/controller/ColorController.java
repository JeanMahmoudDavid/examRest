package com.nm.examRest.controller;

import com.nm.examRest.model.Color;
import com.nm.examRest.repository.ColorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/colors")
public class ColorController {

    @Autowired
    private ColorRepository colorRepository;

    @GetMapping(value = "") // Retrieves the collection of Color ressources
    List<Color> getAll(){
       return this.colorRepository.findAll();
    }

    @PostMapping(value = "") // Create a Color ressource
    ResponseEntity<Color> saveColor(@Valid @RequestBody Color Color) {
        this.colorRepository.save(Color);
        return new ResponseEntity<Color>(Color, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "{Color}") // Remove the Color ressource
    void deleteColor(@PathVariable(name = "Color", required = false) Color Color){
        if(Color == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Couleur inconnue !");
        }else {
            colorRepository.delete(Color);
        }
    }

    @PutMapping(value = "{Color}") // Replace the Color ressource
    ResponseEntity<Color> updateColor(@Valid @RequestBody Color ColorUpdate,
                                            @PathVariable(name="Color", required = false) Color Color){
        if(Color == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Couleur inconnue !");
        } else {
            ColorUpdate.setId(Color.getId());
            this.colorRepository.save(ColorUpdate);
            return new ResponseEntity<Color>(ColorUpdate, HttpStatus.OK);
        }
    }
    
    @GetMapping(value = "{Color}") // Retrieves a Color ressource
    Color getOne(@PathVariable(name="Color", required = false) Color Color){
        if(Color == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Couleur inconnue !");
        }
        return Color;
    }
}
