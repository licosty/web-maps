package com.test.webmaps.controller;

import com.test.webmaps.dto.HouseDTO;
import com.test.webmaps.entity.House;
import com.test.webmaps.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/houses")
public class HouseController {
    private HouseService service;

    @Autowired
    public void setService(HouseService service) {
        this.service = service;
    }

    @GetMapping
    public List<HouseDTO> getHousesWithFullAddressAndCountApartByCityID(
            @RequestParam(required = false) Long city_id,
            @RequestParam(required = false) Long street_id) {

        Specification<House> specification =
                Specification.where(service.filterByCityID(city_id)).and(service.filterByStreetID(street_id));

        return service.getHousesWithCountApart(specification);

    }
}
