package ru.testProject.service;

import ru.testProject.dto.AutoDto;
import ru.testProject.model.Auto;

public interface AutoService {
    public AutoDto getAuto(Integer id);
}
