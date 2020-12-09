package ru.testProject.dto;

import lombok.Data;

@Data
public class AutoDto {
    private Integer id;
    private String number;
    private BrandDto brand;

    public boolean equals(AutoDto autoDto){
        return (number.equals(autoDto.getNumber()) && brand.getId().equals(autoDto.getBrand().getId()));
    }
}
