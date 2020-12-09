package ru.testProject;

import lombok.Data;

@Data
public class WebMessage<T> {
    private int status;
    private T result;

    public static <T> WebMessage<T> ok(){
        WebMessage<T> res = new WebMessage();
        res.setStatus(200);
        return res;
    }

    public static <T> WebMessage<T> ok(T result){
        WebMessage<T> res = new WebMessage();
        res.setStatus(200);
        res.setResult(result);
        return res;
    }
}
