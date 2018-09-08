public class WorkRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable  - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runnable  - END "+Thread.currentThread().getName());
    }

    }

