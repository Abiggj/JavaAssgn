package Threads;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        // print thread start message
        System.out.println(getName() + " starting.");

        // loop until interrupted
        while (!isInterrupted()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // print interrupt message and exit loop
                System.out.println(getName() + " interrupted.");
                interrupt();
            }

            // print loop message
            System.out.println(getName() + " looping.");
        }

        // print thread end message
        System.out.println(getName() + " exiting.");
    }
}
