package ru.testProject.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.testProject.dto.AutoDto;
import ru.testProject.repository.AutoRepository;

@Service
public class AutoServiceImpl implements AutoService {
    private final AutoRepository autoRepository;

    @Autowired
    public AutoServiceImpl(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public AutoDto getAuto(Integer id) {
        return new ModelMapper().map(autoRepository.getOne(id),AutoDto.class);
    }
}
