package Patterns.Basic;

public class EvenOddThread {

    public static void main(String[] args) {

        ThreadDemo t1 = new ThreadDemo("Even Thread");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("Odd Thread");
        t2.start();
    }
}
class ThreadDemo extends Thread {

    ThreadDemo demo;
    ThreadDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <10;i++) {
            if (i%2 == 0 && Thread.currentThread().getName().equalsIgnoreCase("Even Thread")) {
                System.out.println(Thread.currentThread().getName()+"..>"+i);
            } else if (i % 2 != 0 && Thread.currentThread().getName().equalsIgnoreCase("odd Thread")) {
                System.out.println(Thread.currentThread().getName()+"..>"+i);
            }

        }
    }
}


