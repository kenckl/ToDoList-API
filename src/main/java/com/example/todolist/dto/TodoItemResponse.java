package com.example.todolist.dto;

public class TodoItemResponse {
    private Integer toDoId;
    private String text;
    private Boolean isDone;

    public TodoItemResponse(Integer id, String text, Boolean done){
        this.toDoId = id;
        this.text = text;
        this.isDone = done;
    }

    public TodoItemResponse(){
    }

    public Integer getToDoId() {
        return toDoId;
    }

    public void setToDoId(Integer toDoId) {
        this.toDoId = toDoId;
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

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
}
