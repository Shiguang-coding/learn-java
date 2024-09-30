package com.shiguang.b_threadmethod;

/**
 * Created By Shiguang On 2024/9/16 20:05
 */
public class Test01 {
    public static void main(String[] args) {
        // 1、 创建线程对象
        MyThread myThread = new MyThread();

        // 给线程设置名称
        myThread.setName("shiguang");

        // 2、调用start方法,开启线程,jvm自动调用run方法
        myThread.start();

        // 直接调用run方法并不是开启线程,只是方法简单调用,会先执行线程方法,再执行Main方法
//        myThread.run();

        // 同一个线程对象不能连续调用多次start方法,如果想要再次调用start,那么咱们就new一个新的线程对象
        MyThread myThread1 = new MyThread();
        myThread1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程执行了:"+i);

            if (i==4){
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }




    }
}
