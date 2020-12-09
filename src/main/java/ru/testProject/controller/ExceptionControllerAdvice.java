package ru.testProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.testProject.WebMessage;
import ru.testProject.model.BadRequestException;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<WebMessage> handleException(BadRequestException exception){
        WebMessage webMessage = new WebMessage();
        webMessage.setStatus(HttpStatus.BAD_REQUEST.value());
        webMessage.setResult(exception.getMessage());
        return new ResponseEntity<>(webMessage, HttpStatus.BAD_REQUEST);
    }
}