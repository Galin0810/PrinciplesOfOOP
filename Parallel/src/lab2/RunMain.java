package lab2;

public class RunMain {

    public static void main(String[] args) {

        ThreadFirst thread1 = new ThreadFirst("Thread # 1");
        ThreadSecond thread2 = new ThreadSecond("Thread # 2");
        new ThreadDemon().start();
        Thread mainThread = Thread.currentThread();
        mainThread.setName("Main Thread");

        try {
            thread1.getThread().join();
            thread2.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Thread " + mainThread.getName() + " is running!"+" "+ mainThread.getState());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


