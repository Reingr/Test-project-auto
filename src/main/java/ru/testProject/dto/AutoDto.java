package ru.testProject.dto;

import lombok.Data;

@Data
public class AutoDto {
    private Integer id;
    private String number;
    private BrandDto brand;
}
