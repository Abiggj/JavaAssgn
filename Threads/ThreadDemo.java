package Threads;

public class ThreadDemo {
    public static void main(String[] args) {
        // create two threads
        Thread t1 = new MyThread("Thread 1");
        Thread t2 = new MyThread("Thread 2");

        // start the threads
        t1.start();
        t2.start();

        // sleep for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // interrupt both threads
        t1.interrupt();
        t2.interrupt();

        // wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // print the end message
        System.out.println("Main thread exiting.");
    }
}