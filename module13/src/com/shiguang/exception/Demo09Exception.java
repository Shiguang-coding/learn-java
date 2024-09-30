package com.shiguang.exception;

public class Demo09Exception {
    public static void main(String[] args) {
        int result = method();
        System.out.println(result);
    }

    public static int method() {
        try {
            String s = null;
            System.out.println(s.length());//空指针异常
            return 2;
        } catch (Exception e) {
            return 1;
        } finally {
            System.out.println("我一定要执行");
            //return 3;
        }
    }
}