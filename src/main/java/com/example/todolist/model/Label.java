package com.example.todolist.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class Label {

    @MongoId(FieldType.OBJECT_ID)
    private String labelId;
    private String text;

    public Label(String text){
        this.text = text;
    }

    public Label(){}

    public String getlabelId() {
        return labelId;
    }

    public void setlabelId(String toDoId) {
        this.labelId = labelId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
