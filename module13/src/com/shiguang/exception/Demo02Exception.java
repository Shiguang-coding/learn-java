package com.shiguang.exception;

/**
 * Created By Shiguang On 2024/9/16 10:35
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        method(arr);

    }

    public static void method(int[] arr){
        System.out.println(arr[6]);
        System.out.println("我执行了");
    }
}
