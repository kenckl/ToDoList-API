package com.example.todolist.dto;

import java.util.List;

public class TodoItemRequest {
    private String text;
    private Boolean isDone;
    private List<String> tags;

    public TodoItemRequest(String text, Boolean isDone, List<String>tags) {
        this.text = text;
        this.isDone = isDone;
        this.tags = tags;
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

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
