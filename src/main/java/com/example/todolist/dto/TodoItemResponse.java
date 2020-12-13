package com.example.todolist.dto;

import java.util.List;

public class TodoItemResponse {
    private String toDoId;
    private String text;
    private Boolean isDone;
    private List<String> tags;

    public TodoItemResponse(String id, String text, Boolean done, List<String> tags){
        this.toDoId = id;
        this.text = text;
        this.isDone = done;
        this.tags = tags;
    }

    public TodoItemResponse(){
    }

    public String getToDoId() {
        return toDoId;
    }

    public void setToDoId(String toDoId) {
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

    public void setIsDone(Boolean isDone){
        this.isDone = isDone;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
