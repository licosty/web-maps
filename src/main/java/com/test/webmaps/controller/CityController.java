package com.test.webmaps.controller;

import com.test.webmaps.dto.CityDTO;
import com.test.webmaps.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    private CityService service;

    @Autowired
    public void setService(CityService service) {
        this.service = service;
    }

    @GetMapping
    public List<CityDTO> getAllCitiesWithCountHouses() {
        return null;
    }
}
