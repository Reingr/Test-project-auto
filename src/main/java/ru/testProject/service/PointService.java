package ru.testProject.service;

import ru.testProject.dto.PointDto;

import java.util.List;

public interface PointService {
    PointDto get(Integer id);

    List<PointDto> getAll();

    void add(PointDto pointDto);

    void delete(Integer id);

    PointDto update(PointDto newPointDto);
}
