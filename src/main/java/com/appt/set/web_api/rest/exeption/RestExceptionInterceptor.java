package com.appt.set.web_api.rest.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class RestExceptionInterceptor {
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class) MessageExceptionRest
    hanleException(HttpServletRequest request, IllegalArgumentException exception){
        return  MessageExceptionRest.builder()
        .url(request.getRequestURI())
        .message(exception.getLocalizedMessage())
        .build();
    }
}