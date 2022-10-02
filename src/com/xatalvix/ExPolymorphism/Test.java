package com.xatalvix.ExPolymorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat =new Cat();
        animal.eat();
        dog.eat();
        cat.eat();

        test(animal);
        test(dog);
        test(cat);
    }
    public static void test(Animal animal) {
        animal.eat();
    }
}
