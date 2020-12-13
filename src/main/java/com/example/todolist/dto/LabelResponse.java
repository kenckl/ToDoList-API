package com.example.todolist.dto;

public class LabelResponse {
    private String id;
    private String text;
    private String colour;

    public LabelResponse(String id, String text, String colour) {
        this.id = id;
        this.text = text;
        this.colour = colour;
    }

    public LabelResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
