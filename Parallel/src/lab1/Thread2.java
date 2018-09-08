package lab1;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread 2 R  - START "+Thread.currentThread().toString());

    }
    Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Thread 3 - START " + Thread.currentThread().toString());
        }
    });




    Thread thread4 = new Thread (()->{

        System.out.println("Thread 4 - START " + Thread.currentThread().toString());
        thread3.start();

    });


}
