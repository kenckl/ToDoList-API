package com.example.todolist.exception;

public class ToDoItemNotFoundException extends Exception {
    public ToDoItemNotFoundException(){
        super("ToDoItem Not Found");
    }
}

