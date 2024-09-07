
// synchronized keyword is used to lock the method so that only one thread can access it at a time
class Brackets {

    //synchronized method
    synchronized public static  void generate() {
        for (int i = 0; i <= 20; i++) {
            if (i <= 10) {
                System.out.print("[");
            } else {
                System.out.print("]");
            }
        }
        System.out.println();
    }
}
//synchronized block
class Brackets2 {
    public void generate2() throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i <= 20; i++) {
                if (i <= 10) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }
    }
}

public class Synchronized {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    Brackets.generate();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    Brackets.generate();
                }
            }
        }).start();

        Brackets2 b = new Brackets2();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    try {
                        b.generate2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        ).start();
    }
}
