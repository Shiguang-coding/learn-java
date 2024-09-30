package com.shiguang.i_synchronized;

public class MyTicket implements Runnable{
    //定义100张票
    int ticket = 100;

    //任意new一个对象
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 必须是同一个锁对象
//            synchronized (new Object()){
//                if (ticket>0){
//                    System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
//                    ticket--;
//                }
//            }


            synchronized (obj){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
                    ticket--;
                }
            }

        }
    }
}