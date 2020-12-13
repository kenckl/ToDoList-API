package com.example.todolist.dto;

public class LabelRequest {
    private String text;
    private String colour;

    public LabelRequest(String text, String colour) {
        this.text = text;
        this.colour = colour;
    }

    public LabelRequest() {
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
