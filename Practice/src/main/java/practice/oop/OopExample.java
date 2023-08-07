package practice.oop;

import animals.Cat;

public class OopExample {

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "White", "2020-01-20");
        System.out.println(cat);
//        cat.colour = "Black";
//        cat.name = "Murzik";
//        cat.setAge(5);
        cat.setName("Murzik");
        cat.setColour("Black");
        System.out.println(cat);

    }

}
