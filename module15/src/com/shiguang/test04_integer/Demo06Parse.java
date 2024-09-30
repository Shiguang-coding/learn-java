package com.shiguang.test04_integer;

/**
 * Created By Shiguang On 2024/9/16 16:39
 */
public class Demo06Parse {
    public static void main(String[] args) {
//        method01();
        method02();
    }

    private static void method01() {
        int i = 10;
        String s1 = i+"";
        System.out.println(s1+1);

        System.out.println("============");

        String s = String.valueOf(10);
        System.out.println(s+1);
    }

    private static void method02() {
        int number = Integer.parseInt("1111");
        System.out.println(number+1);
    }
}
