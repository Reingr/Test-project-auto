package ru.testProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.testProject.dto.WebMessage;
import ru.testProject.model.BadRequestException;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<WebMessage> handleException(BadRequestException exception){
        return new ResponseEntity<>(WebMessage.error(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}