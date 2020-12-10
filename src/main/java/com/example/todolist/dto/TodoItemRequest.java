package com.example.todolist.dto;

public class TodoItemRequest {
    private String text;
    private Boolean isDone;

    public TodoItemRequest(String text, Boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    public TodoItemRequest (){

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getIsDone() {
        return isDone;
    }
    public void setDone(Boolean isDone) {
        this.isDone = isDone;
    }
}
