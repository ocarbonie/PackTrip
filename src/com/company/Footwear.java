package com.company;

public class Footwear {
    private String color;
    private String material;
    private String size;
    private String style;

    public Footwear() {
    }

    public Footwear(String color, String material, String size, String style) {
        this.color = color;
        this.material = material;
        this.size = size;
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    @Override
    public String toString(){
        return "Footwear: " + this.color + " " + this.material + " " + this.style + " " + this.size;
    }
}
