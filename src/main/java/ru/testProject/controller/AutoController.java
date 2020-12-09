package ru.testProject.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.testProject.dto.AutoDto;
import ru.testProject.service.AutoService;

@RestController
public class AutoController {
    private final AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @ApiOperation(value = "Получение данных о автомобиле", httpMethod = "GET")
    @RequestMapping(value = "getauto", method = RequestMethod.GET)
    public AutoDto getFile(
            @ApiParam(value = "Id автомобиля в базе данных", name = "id")
            @RequestParam("id") Integer id) {
        return autoService.getAuto(id);
    }
}
