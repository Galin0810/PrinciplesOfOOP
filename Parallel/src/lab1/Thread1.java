package lab1;

public class Thread1  extends Thread {

    public Thread1(ThreadGroup group, String name) {
        super(group,name);
    }

    @Override
    public void run() {

        System.out.println("Thread 1 - START " +Thread.currentThread().toString());

    }


}