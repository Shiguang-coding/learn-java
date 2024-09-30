package com.shiguang.e_newjdk;

/**
 * Created By Shiguang On 2024/9/18 12:02
 */
public class Test07 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method1(dog);
    }


    public static void method(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eat();
            dog.lookDoor();
        }
    }

    public static void method1(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.eat();
            dog.lookDoor();
        }
    }

}
