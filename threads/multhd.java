
import java.util.*;

class Que {
    int n;
    boolean Flag = false;
    int counter = 0;

    synchronized void put(int x) {
        while (Flag == true) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        n = x;
        Flag = true;
        notifyAll();
    }

    synchronized int get() {
        while (Flag == false) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        counter++;
        if (counter == 2) {
            Flag = false;
            counter = 0;
        }
        notifyAll();
        return n;
    }
}

class Producer extends Thread {
    Que q;

    Producer(Que obj) {
        super("pthd");
        q = obj;
    }

    public void run() {
        Random R = new Random();
        int i = 0;
        while (i < 2) {
            int rn = R.nextInt(10) + 1;

            System.out.println("Value sent = " + rn);
            q.put(rn);
            i++;
            try {
                sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.exit(0);
    }
}

class Consumer1 extends Thread {
    Que q;

    Consumer1(Que obj) {
        super("c1thd");
        q = obj;
    }

    public void run() {
        while (true) {
            int val = q.get();
            if (val % 2 == 0)
                System.out.println("Square = " + (val * val));
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer2 extends Thread {
    Que q;

    Consumer2(Que obj) {
        super("c2thd");
        q = obj;
    }

    public void run() {
        while (true) {
            int val = q.get();
            if (val % 2 != 0)
                System.out.println("Cube = " + (val * val * val));
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class multhd {
    public static void main(String[] args) throws Exception {
        Que Q = new Que();
        Producer P = new Producer(Q);
        Consumer1 C1 = new Consumer1(Q);
        Consumer2 C2 = new Consumer2(Q);
        P.start();
        C1.start();
        C2.start();
    }
}
