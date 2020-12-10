package ru.testProject.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class WebMessage<T> {
    private int status;
    private T result;

    public static <T> WebMessage<T> ok(){
        WebMessage<T> res = new WebMessage();
        res.setStatus(HttpStatus.OK.value());
        return res;
    }

    public static <T> WebMessage<T> ok(T result){
        WebMessage<T> res = new WebMessage();
        res.setStatus(HttpStatus.OK.value());
        res.setResult(result);
        return res;
    }

    public static <T> WebMessage<T> error(){
        WebMessage<T> res = new WebMessage();
        res.setStatus(HttpStatus.BAD_REQUEST.value());
        return res;
    }

    public static <T> WebMessage<T> error(T result){
        WebMessage<T> res = new WebMessage();
        res.setStatus(HttpStatus.BAD_REQUEST.value());
        res.setResult(result);
        return res;
    }
}
