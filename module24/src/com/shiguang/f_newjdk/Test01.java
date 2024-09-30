package com.shiguang.f_newjdk;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person("张三");
        Person person1 = new Person("张三");
        System.out.println(person);

        System.out.println(person == person1);

        System.out.println(person.equals(person1));
    }
}