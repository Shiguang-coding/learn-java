package com.shiguang.f_newjdk;

/**
 * Created By Shiguang On 2024/9/18 12:11
 */
public record Person(String name) {
    //int i;//不能声明实例变量

    static int i;//可以声明静态变量

//不能声明空参构造
/*    public Person(){

    }*/

    //可以声明静态方法
    public static void method() {

    }

    //可以声明非静态方法
    public void method01() {

    }
}
