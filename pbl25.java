/*Write a Java program where two threads print multiplication tables (e.g., Table of 5 and Table of
7). Use a synchronized method so that table outputs do not mix and remain consistent. */

// Class with synchronized method
class TablePrinter {

    // Synchronized method
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(200); // small delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

// Thread class
class MyThread extends Thread {
    TablePrinter t;
    int number;

    MyThread(TablePrinter t, int number) {
        this.t = t;
        this.number = number;
    }

    public void run() {
        t.printTable(number);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        TablePrinter obj = new TablePrinter();

        // Two threads
        MyThread t1 = new MyThread(obj, 5);
        MyThread t2 = new MyThread(obj, 7);

        t1.start();
        t2.start();
    }
}
