package ru.testProject.dto;

import lombok.Data;
import ru.testProject.model.Auto;
import ru.testProject.model.Point;

@Data
public class AutoPositionDto {
    private Integer id;
    private Auto auto;
    private Point point;
}
