package com.company;

public class Shirt {
    private String color;
    private String size;
    private String type;
    private String pattern;
    private String fabric;

    public Shirt() {
    }

    public Shirt(String color, String size, String type, String pattern, String fabric) {
        this.color = color;
        this.size = size;
        this.type = type;
        this.pattern = pattern;
        this.fabric = fabric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    @Override
    public String toString(){
        return "Shirt: " + this.color + " " + this.fabric + " " + this.pattern + " " + this.size;
    }
}
