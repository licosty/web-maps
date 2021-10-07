package com.test.webmaps.service;

import com.test.webmaps.dto.StreetDTO;
import com.test.webmaps.entity.Street;
import com.test.webmaps.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StreetService {
    private StreetRepository streetRepository;

    public List<StreetDTO> getStreetsWithCountHousesByCityID(Specification<Street> specification) {
        List<Street> streets = streetRepository.findAll(specification);

        return streets.stream()
                .map(street -> new StreetDTO(street.getName(), street.getHouses().size()))
                .collect(Collectors.toList());
    }

    public Specification<Street> filterByCityID(Long city_id) {
        return (root, criteriaQuery, criteriaBuilder) ->
                city_id == null ? null : criteriaBuilder.equal(root.get("city").get("id"), city_id);
    }

    @Autowired
    public void setStreetRepository(StreetRepository streetRepository) {
        this.streetRepository = streetRepository;
    }
}
