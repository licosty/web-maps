package com.test.webmaps.service;

import com.test.webmaps.dto.CityDTO;
import com.test.webmaps.entity.City;
import com.test.webmaps.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {
    private CityRepository cityRepository;


    public List<CityDTO> getCitiesWithCountHouses() {
        List<City> cities = cityRepository.findAll();

        return cities.stream()
                .map(city -> new CityDTO(city.getName(),
                        city.getStreets().stream().mapToLong(street -> street.getHouses().size()).sum()))
                .collect(Collectors.toList());
    }

    @Autowired
    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
}
