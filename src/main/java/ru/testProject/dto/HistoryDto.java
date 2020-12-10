package ru.testProject.dto;

import lombok.Data;
import ru.testProject.model.Auto;
import ru.testProject.model.HistoryStatus;
import ru.testProject.model.Point;

@Data
public class HistoryDto {
    private Integer id;
    private HistoryStatus status;
    private Auto auto;
    private Point point;
}
