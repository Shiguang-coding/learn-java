package com.shiguang.c_hashtable_vector;

import java.util.Vector;

public class Demo02Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("张三");
        vector.add("李四");
        for (String s : vector) {
            System.out.println(s);
        }
    }
}