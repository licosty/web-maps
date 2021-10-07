package com.test.webmaps.service;

import com.test.webmaps.dto.HouseDTO;
import com.test.webmaps.entity.House;
import com.test.webmaps.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HouseService {
    private HouseRepository houseRepository;

    public List<HouseDTO> getHousesWithCountApart(Specification<House> specification) {
        List<House> houses = houseRepository.findAll(specification);

        return houses.stream()
                .map(house -> new HouseDTO(
                        house.getStreet().getCity().getName(),
                        house.getStreet().getName(), house.getNumber(),
                        (long) house.getApartments().size()))
                .collect(Collectors.toList());
    }

    public Specification<House> filterByCityID(Long city_id) {
        return (root, criteriaQuery, criteriaBuilder) ->
                city_id == null ? null : criteriaBuilder.equal(root.get("street").get("city").get("id"), city_id);
    }

    public Specification<House> filterByStreetID(Long street_id) {
        return (root, criteriaQuery, criteriaBuilder) ->
                street_id == null ? null : criteriaBuilder.equal(root.get("street").get("id"), street_id);
    }

    @Autowired
    public void setHouseRepository(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }
}
