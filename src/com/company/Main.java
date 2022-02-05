package com.company;

public class Main {

    public static void main(String[] args) {
        ObjCollectionImpl collection1 = new ObjCollectionImpl();
        ObjCollectionImpl collection2 = new ObjCollectionImpl();
        Person person1 = new Person("Den", "Son", 20);
        Person person3 = new Person("Oleg", "Markenson", 34);
        Person person2 = new Person("Kostya", "William", 21);

        collection1.add(person1);
        collection1.add(person2);
        collection1.add(person3);
        collection1.add(person2);
        collection2.add(person1);
        collection2.add(person2);
        collection2.add(person3);
        collection2.add(person2);
        collection1.show();

        System.out.println();
        System.out.println("............................");
        System.out.println();

        collection1.add(1,"Mark");
        collection2.add(1,"Mark");
        collection1.add(person1);
        collection1.add(person1);
        collection1.show();

        System.out.println(collection1.size());
        System.out.println(collection1.contain("Mark"));
        System.out.println(collection1.equals(collection1));
    }
}
