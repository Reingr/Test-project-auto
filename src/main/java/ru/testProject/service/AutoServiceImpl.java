package ru.testProject.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.testProject.dto.AutoDto;
import ru.testProject.model.Auto;
import ru.testProject.model.BadRequestException;
import ru.testProject.repository.AutoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutoServiceImpl implements AutoService {
    private final AutoRepository autoRepository;

    @Autowired
    public AutoServiceImpl(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public AutoDto get(Integer id) {
        try {
            return new ModelMapper().map(autoRepository.getOne(id), AutoDto.class);
        } catch (Exception e) {
            throw new BadRequestException("Автомобиль с id=" + id + " не найден");
        }
    }

    public List<AutoDto> getAll() {
        return autoRepository.findAll()
                .stream().map(x -> new ModelMapper().map(x, AutoDto.class))
                .collect(Collectors.toList());
    }

    public void add(AutoDto autoDto) {
        autoRepository.save(new ModelMapper().map(autoDto, Auto.class));
    }

    public void delete(Integer id) {
        try {
            autoRepository.deleteById(id);
        } catch (Exception e) {
            throw new BadRequestException("Автомобиль с id=" + id + " не найден");
        }
    }

    public AutoDto update(AutoDto newAutoDto) {
        AutoDto autoDto = get(newAutoDto.getId());
        if (!newAutoDto.equals(autoDto)) {
            autoRepository.save(new ModelMapper().map(newAutoDto, Auto.class));
        }
        return newAutoDto;
    }
}
