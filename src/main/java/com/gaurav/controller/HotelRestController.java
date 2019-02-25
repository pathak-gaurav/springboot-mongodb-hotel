package com.gaurav.controller;

import com.gaurav.document.Hotel;
import com.gaurav.repository.HotelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelRestController {

    private HotelRepository repository;

    public HotelRestController(HotelRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hotels")
    public List<Hotel> getAllHotels(){
        return repository.findAll();
    }
}
