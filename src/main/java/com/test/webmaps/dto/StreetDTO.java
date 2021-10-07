package com.test.webmaps.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StreetDTO {
    private String street;
    private Integer countOfHouses;
}
