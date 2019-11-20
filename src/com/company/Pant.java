package com.company;

public class Pant {
    private String color;
    private String pattern;
    private String size;
    private String type;

    public Pant() {
    }

    public Pant(String color, String pattern, String size, String type) {
        this.color = color;
        this.pattern = pattern;
        this.size = size;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return "Pant :" + this.color + " " + this.pattern + " " + this.type + " " + this.size;
    }
}
