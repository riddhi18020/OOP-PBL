/*Write a Java program that creates two threads:
● First thread prints numbers from 1 to 10 at the interval of 1 second.
● Second thread prints numbers from 11 to 20 at the interval of 500 ms.
Run both threads and display the output. */

// Thread 1: Prints 1 to 10 every 1 second
class ThreadOne extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                Thread.sleep(1000); // 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Thread 2: Prints 11 to 20 every 500 ms
class ThreadTwo extends Thread {
    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                Thread.sleep(500); // 500 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Start both threads
        t1.start();
        t2.start();
    }
}
