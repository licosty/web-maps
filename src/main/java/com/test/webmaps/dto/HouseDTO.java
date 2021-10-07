package com.test.webmaps.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseDTO {
    private String address;
    private Long countOfApartments;

    public HouseDTO(String city, String street, String house, Long countOfApartments) {
        String format = "г. %s, ул. %s, д. %s";
        address = String.format(format, city, street, house);
        this.countOfApartments = countOfApartments;
    }
}
