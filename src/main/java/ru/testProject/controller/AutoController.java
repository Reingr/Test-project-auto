package ru.testProject.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.testProject.dto.WebMessage;
import ru.testProject.dto.AutoDto;
import ru.testProject.service.AutoService;

import java.util.List;

@RestController
@RequestMapping("/auto")
public class AutoController {
    private final AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @ApiOperation(value = "Получение данных о автомобиле", httpMethod = "GET")
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public WebMessage<AutoDto> get(
            @ApiParam(value = "Id автомобиля в базе данных", name = "id")
            @RequestParam("id") Integer id) {
        return WebMessage.ok(autoService.get(id));
    }

    @ApiOperation(value = "Получение данных о всех автомобилях", httpMethod = "GET")
    @RequestMapping(value = "getall", method = RequestMethod.GET)
    public WebMessage<List<AutoDto>> getAll() {
        return WebMessage.ok(autoService.getAll());
    }

    @ApiOperation(value = "Добавление нового автомобиля в систему", httpMethod = "POST")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public WebMessage add(
            @ApiParam(value = "Данные автомобиля", name = "auto")
            @RequestBody AutoDto autoDto) {
        autoService.add(autoDto);
        return WebMessage.ok();
    }

    @ApiOperation(value = "Удаление данных об автомобиле из системы", httpMethod = "GET")
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public WebMessage delete(
            @ApiParam(value = "Id автомобиля в базе данных", name = "id")
            @RequestParam("id") Integer id) {
        autoService.delete(id);
        return WebMessage.ok();
    }

    @ApiOperation(value = "Редактирование данных об автомобиле", httpMethod = "POST")
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public WebMessage<AutoDto> update(
            @ApiParam(value = "Данные автомобиля", name = "auto")
            @RequestBody AutoDto autoDto) {
        return WebMessage.ok(autoService.update(autoDto));
    }
}
