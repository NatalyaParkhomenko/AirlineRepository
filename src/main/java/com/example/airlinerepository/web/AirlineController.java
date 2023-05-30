package com.example.airlinerepository.web;

import com.example.airlinerepository.entity.Airline;
import com.example.airlinerepository.repository.AirlineRepository;
import com.example.airlinerepository.web.requesr.AirlineReq;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airline")
public class AirlineController {
    @Autowired
    private AirlineRepository repository;
    @GetMapping("/getAll")
public List<Airline>getAll(){
        return repository.findAll();
    }
    @GetMapping("/getById")
    public Airline getById(@RequestParam long id){
        Airline airline=repository.findById(id).get();
        return airline;
    }
    @PostMapping("/save")
    public void save(@Valid@RequestBody AirlineReq request){
        Airline airline =new Airline();
        airline.setName(request.getName());
        airline.setIata(request.getIata());
        airline.setFoundationDate(request.getFoundationDate());
        airline.setCeoEmail(request.getCeoEmail());
        airline.setFleet(request.getFleet());
        airline.setCountry(request.getCountry());
        repository.save(airline);
    }
    @DeleteMapping("/dalataById")
    public void deleteById(@RequestParam long id){
        repository.deleteById(id);
    }
}

