package ru.testProject.dto;

import lombok.Data;
import ru.testProject.model.Auto;
import ru.testProject.model.Person;
import ru.testProject.model.Point;

import java.time.LocalDateTime;

@Data
public class HistoryDto {
    private Integer id;
    private Auto auto;
    private Point pointRent;
    private Point pointReturn;
    private Person person;
    private LocalDateTime dateRent;
    private LocalDateTime dateReturn;
}
