package ru.testProject.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.testProject.dto.PointDto;
import ru.testProject.model.BadRequestException;
import ru.testProject.model.Point;
import ru.testProject.repository.PointRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PointServiceImpl implements PointService {
    private final PointRepository pointRepository;

    @Autowired
    public PointServiceImpl(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public PointDto get(Integer id) {
        try {
            return new ModelMapper().map(pointRepository.getOne(id), PointDto.class);
        } catch (Exception e) {
            throw new BadRequestException("Точка с id=" + id + " не найдена");
        }
    }

    public List<PointDto> getAll() {
        return pointRepository.findAll()
                .stream().map(x -> new ModelMapper().map(x, PointDto.class))
                .collect(Collectors.toList());
    }

    public void add(PointDto pointDto) {
        pointRepository.save(new ModelMapper().map(pointDto, Point.class));
    }

    public void delete(Integer id) {
        try {
            pointRepository.deleteById(id);
        } catch (Exception e) {
            throw new BadRequestException("Точка с id=" + id + " не найдена");
        }
    }

    public PointDto update(PointDto newPointDto) {
        PointDto pointDto = get(newPointDto.getId());
        if (!newPointDto.equals(pointDto)) {
            pointRepository.save(new ModelMapper().map(newPointDto, Point.class));
        }
        return newPointDto;
    }
}
