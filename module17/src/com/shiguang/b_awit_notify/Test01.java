package com.shiguang.b_awit_notify;

public class Test01 {
    public static void main(String[] args) {
        BaoZiPu baoZiPu = new BaoZiPu();

        Product product = new Product(baoZiPu);
        Consumer consumer = new Consumer(baoZiPu);

        Thread p1 = new Thread(product);
        Thread p2 = new Thread(product);
        Thread p3 = new Thread(product);
        Thread c1 = new Thread(consumer);
        Thread c2 = new Thread(consumer);
        Thread c3 = new Thread(consumer);

        p1.start();
        p2.start();
        p3.start();

        c1.start();
        c2.start();
        c3.start();
    }
}