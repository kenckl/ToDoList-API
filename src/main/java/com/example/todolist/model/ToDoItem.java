package com.example.todolist.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class ToDoItem {

    @MongoId(FieldType.OBJECT_ID)
    private Integer toDoId;
    private String text;
    private boolean isDone;

    public ToDoItem(Integer toDoId, String text){
        this.toDoId = toDoId;
        this.text = text;
        this.isDone = false;
    }

    public ToDoItem(){}

    public int getToDoId() {
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

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
}
