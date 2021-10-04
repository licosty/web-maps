package com.test.webmaps.controller;

import com.test.webmaps.dto.StreetDTO;
import com.test.webmaps.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/streets")
public class StreetController {
    private StreetService service;

    @Autowired
    public void setService(StreetService service) {
        this.service = service;
    }

    @GetMapping
    public List<StreetDTO> getAllStreetsWithCountHousesByCityID(@RequestParam Long city_id) {
        return null;
    }
}
