package com.shiguang.a_wait_notify;

public class Product implements Runnable {
    private BaoZiPu baoZiPu;

    public Product(BaoZiPu baoZiPu) {
        this.baoZiPu = baoZiPu;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (baoZiPu) {
                //1.判断flag是否为true,如果是true,证明有包子,生产线程等待
                if (baoZiPu.isFlag() == true) {
                    try {
                        baoZiPu.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                //2.如果flag为false,证明没有包子,开始生产
                baoZiPu.setCount();
                //3.改变flag状态,为true,证明生产完了,有包子了
                baoZiPu.setFlag(true);
                //4.唤醒消费线程
                baoZiPu.notify();
            }
        }
    }
}
