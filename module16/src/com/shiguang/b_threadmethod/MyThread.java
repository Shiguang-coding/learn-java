package com.shiguang.b_threadmethod;

/**
 * Created By Shiguang On 2024/9/16 20:03
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + "执行了:" + i);
            // 线程休眠
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
