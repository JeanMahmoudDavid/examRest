package com.nm.examRest.controller;

import com.nm.examRest.model.Car;
import com.nm.examRest.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    
    @GetMapping(value = "") // Retrieves the collection of Car Ressources
    List<Car> getAll(){
       return this.carRepository.findAll();
    }

    @PostMapping(value = "") // Create a Car Ressource
    ResponseEntity<Car> saveCar(@Valid @RequestBody Car car) {
        this.carRepository.save(car);
        return new ResponseEntity<Car>(car, HttpStatus.CREATED);
    }
    
    @GetMapping(value = "{car}") // Retrieves a Car Ressource
    Car getOne(@PathVariable(name="car", required = false) Car car){
        if(car == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Voiture inconnue !");
        }
        return car;
    }
}
