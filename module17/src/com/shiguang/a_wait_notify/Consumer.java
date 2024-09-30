package com.shiguang.a_wait_notify;

public class Consumer implements Runnable {
    private BaoZiPu baoZiPu;

    public Consumer(BaoZiPu baoZiPu) {
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
                //1.判断flag是否为false,如果是false,证明没有包子,消费线程等待
                if (baoZiPu.isFlag() == false) {
                    try {
                        baoZiPu.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                //2.如果flag为true,证明有包子,开始消费
                baoZiPu.getCount();
                //3.改变flag状态,为false,证明消费完了,没 有包子了
                baoZiPu.setFlag(false);
                //4.唤醒生产线程
                baoZiPu.notify();
            }
        }
    }
}
