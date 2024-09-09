import java.util.Random;

class MyCounter implements Runnable{
    private final int threadNo;
    public MyCounter(int threadNo){this.threadNo = threadNo;}

    @Override
     public void run() {
      for (int i = 0; i < 10; i++) {
        System.out.println("Thread " + threadNo + " Counter: " + i);
        try {
          Random random = new Random();
          Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
}

public class mainThread{

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyCounter(1));
        Thread t2 = new Thread(new MyCounter(2));
        t1.start();
        t2.start();
        new Thread(new MyCounter(3)).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 4 Counter: " + i);
                    try {
                        Random random = new Random();
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}