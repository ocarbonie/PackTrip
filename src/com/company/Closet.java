package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Closet {
    private ArrayList<Jacket>jackets = new ArrayList<>();
    private ArrayList<Pant>pants= new ArrayList<>();
    private ArrayList<Shirt>shirts = new ArrayList<>();
    private ArrayList<Footwear>shoes = new ArrayList<>();
    private Random r = new Random();

    public void addJacket(){
        Jacket a = new Jacket("brown", "XL", "dotted", "down");
        Jacket b = new Jacket("blue", "XL", "solid","cotton");
        Jacket c = new Jacket("purple", "XL","faded","Corduroy");

        jackets.add(a);
        jackets.add(b);
        jackets.add(c);
    }
    public String getJacket(){
        int x = 0;
        x = r.nextInt(3);
        return jackets.get(x).toString();
    }

    public void addPants(){
        Pant a = new Pant("black", "solid", "L", "Straight leg");
        Pant b = new Pant("blue", "striped", "L", "Bell Bottoms" );
        Pant c = new Pant("dark green", "solid","L","tight");
        pants.add(a);
        pants.add(b);
        pants.add(c);
    }

    public String getPant(){
        int x = 0;
        x = r.nextInt(3);
        return pants.get(x).toString();
    }

    public void addShirts(){
        Shirt a = new Shirt("white", "L","tube top", "solid","cotton");
        Shirt b = new Shirt("blue", "L","t-shirt", "striped", "synthetic");
        Shirt c = new Shirt("orange", "L", "flannel", "plaid", "cotton");

        shirts.add(a);
        shirts.add(b);
        shirts.add(c);
    }

    public String getShirt(){
        int x = 0;
        x = r.nextInt(3);
        return shirts.get(x).toString();
    }

    public void addShoes(){
        Footwear a = new Footwear("white", "cloth", "11", "sneakers");
        Footwear b = new Footwear("Black", "leather", "11", "hiking shoes");
        Footwear c = new Footwear("blue", "cloth", "11","flats");

        shoes.add(a);
        shoes.add(b);
        shoes.add(c);
    }

    public String getFootwear(){
        int x = 0;
        x = r.nextInt(3);
        return shoes.get(x).toString();
    }
}
