package com.example.todolist.advice;

import com.example.todolist.advice.errorMessage.ErrorResponse;
import com.example.todolist.exception.LabelNotFoundException;
import com.example.todolist.exception.ToDoItemNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({IllegalArgumentException.class})
    public ErrorResponse handleBadRequest(IllegalArgumentException exception) {
        return new ErrorResponse(exception.getMessage(), HttpStatus.BAD_REQUEST.name());
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({ToDoItemNotFoundException.class})
    public ErrorResponse handleEmployeeNotFound(ToDoItemNotFoundException exception) {
        return new ErrorResponse(exception.getMessage(), HttpStatus.NOT_FOUND.name());
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(LabelNotFoundException.class)
    public ErrorResponse handleLabelNotFound(LabelNotFoundException exception){
        return new ErrorResponse(exception.getMessage(),HttpStatus.NOT_FOUND.name());
    }
}