package com.shiguang.test04_integer;

public class Demo05Integer {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1 == i2); // true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4); // false

        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4));
    }
}