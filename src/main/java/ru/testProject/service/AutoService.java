package ru.testProject.service;

import ru.testProject.dto.AutoDto;

import java.util.List;

public interface AutoService {
    AutoDto get(Integer id);

    List<AutoDto> getAll();

    void add(AutoDto autoDto);

    void delete(Integer id);

    AutoDto update(AutoDto newAutoDto);
}
