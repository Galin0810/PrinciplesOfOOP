package lab2;

public class ThreadDemon extends Thread {

    public ThreadDemon() {
        setDaemon(true);
    }

    public void run() {
        System.out.println (Thread.currentThread().getState()+"  " + Thread.currentThread().getName());
}}
