package com.shiguang.a_lambda;

/**
 * Created By Shiguang On 2024/9/17 23:19
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public void open() {
                System.out.println("open");
            }
        });

        System.out.println("=========== lambda ============");

        method(() -> System.out.println("open"));

    }

    public static void method(USB usb) {
        usb.open();
    }
}
