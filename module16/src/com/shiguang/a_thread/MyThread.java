package com.shiguang.a_thread;

/**
 * Created By Shiguang On 2024/9/16 20:03
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread执行了:"+i);
        }
    }
}
