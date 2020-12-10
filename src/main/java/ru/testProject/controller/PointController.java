package ru.testProject.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.testProject.dto.WebMessage;
import ru.testProject.dto.PointDto;
import ru.testProject.service.PointService;

import java.util.List;

@RestController
@RequestMapping("/point")
public class PointController {
    private final PointService pointService;

    @Autowired
    public PointController(PointService pointService) {
        this.pointService = pointService;
    }

    @ApiOperation(value = "Получение данных о точке", httpMethod = "GET")
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public WebMessage<PointDto> get(
            @ApiParam(value = "Id точки в базе данных", name = "id")
            @RequestParam("id") Integer id) {
        return WebMessage.ok(pointService.get(id));
    }

    @ApiOperation(value = "Получение данных о всех точках", httpMethod = "GET")
    @RequestMapping(value = "getall", method = RequestMethod.GET)
    public WebMessage<List<PointDto>> getAll() {
        return WebMessage.ok(pointService.getAll());
    }

    @ApiOperation(value = "Добавление новой точки в систему", httpMethod = "POST")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public WebMessage add(
            @ApiParam(value = "Данные точки", name = "auto")
            @RequestBody PointDto pointDto) {
        pointService.add(pointDto);
        return WebMessage.ok();
    }

    @ApiOperation(value = "Удаление данных о точке из системы", httpMethod = "GET")
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public WebMessage delete(
            @ApiParam(value = "Id точки в базе данных", name = "id")
            @RequestParam("id") Integer id) {
        pointService.delete(id);
        return WebMessage.ok();
    }

    @ApiOperation(value = "Редактирование данных о точке", httpMethod = "POST")
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public WebMessage<PointDto> update(
            @ApiParam(value = "Данные точки", name = "auto")
            @RequestBody PointDto pointDto) {
        return WebMessage.ok(pointService.update(pointDto));
    }
}
