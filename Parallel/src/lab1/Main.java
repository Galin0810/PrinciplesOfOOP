package lab1;

public class Main {

    public static void main(String[] args){
        ThreadGroup tg = new ThreadGroup("My Group");

        Thread t1 = new Thread1(tg,"t1");
        t1.start();
        Thread t2 = new Thread(new Thread2(), "t2");
        t2.start();

        Thread t4 =new Thread(new Thread2().thread4,"t4");
        t4.start();

        System.out.println("MyThreads has been started");

    }
}
