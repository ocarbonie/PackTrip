package com.company;

public class Main {

    public static void main(String[] args) {
        Closet a = new Closet();
        System.out.println("We are going on a trip!!!!");
        System.out.println("Here is the content of your suitcase: ");

        a.addJacket();
        a.addPants();
        a.addShirts();
        a.addShoes();

        System.out.println(a.getJacket());
        System.out.println(a.getPant());
        System.out.println(a.getShirt());
        System.out.println(a.getFootwear());
    }
}
