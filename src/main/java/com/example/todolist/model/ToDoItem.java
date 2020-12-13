package com.example.todolist.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document
public class ToDoItem {

    @MongoId(FieldType.OBJECT_ID)
    private String toDoId;
    private String text;
    private boolean isDone;
    private List<String> tags;

    public ToDoItem(String text, boolean isDone, List<String> tags){
        this.text = text;
        this.isDone = false;
        this.tags = tags;
    }

    public ToDoItem(){}

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

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
