package lab2;

import java.util.Arrays;

public class ThreadSecond implements Runnable {

    private Thread thread;

    public ThreadSecond(String name) {
        thread = new Thread(this, name);
        thread.setPriority(7);
        thread.start();
    }

    @Override
    public void run() {

        int first = 1;
        int last = 20;
        boolean[] isPrimes = new boolean[1 + last];
        Arrays.fill(isPrimes, 2, isPrimes.length, true);

        for (int i = 2; i * i <= last; i++) {
            if (isPrimes[i]) {
                for (int k = i * i; k <= last; k += i) {
                    isPrimes[k] = false;
                }
            }
        }
        boolean absent = true;
        System.out.println(thread.getName() + " Prior: " + thread.getPriority() +" " + thread.getState() + " Eratosthenes sieve : ");
        for (int i = first; i <= last; i++) {
            if (isPrimes[i]) {

                System.out.println(i+" -e ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                absent = true;
            }
        }
    }


    public Thread getThread() {
        return thread;
    }
}