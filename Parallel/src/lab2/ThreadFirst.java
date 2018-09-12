package lab2;

public class ThreadFirst implements Runnable {

    private Thread thread;

    public ThreadFirst(String name) {
        thread = new Thread(this, name);
        thread.setPriority(8);
        thread.start();
    }

    @Override
    public void run() {
        int n = 10, t1 = 0, t2 = 1;
        System.out.println(thread.getName()+" Prior: "+thread.getPriority()+" " + thread.getState()+" Fibonacci numbers : " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.println(t1 + " -f ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
    }


    public Thread getThread() {
        return thread;
    }
}