package com.company;

public class Jacket {
    private String color;
    private String size;
    private String pattern;
    private String fabric;

    public Jacket() {
    }

    public Jacket(String color, String size, String pattern, String fabric) {
        this.color = color;
        this.size = size;
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
        return "Jacket: " + this.color + " " + this.fabric + " " + this.pattern + " " + this.size;
    }
}
