import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    static Thread thread = new Thread()
    {
        @Override
        public void run() {
            super.run();
            System.out.println("gogogogo");
        }
    };

    public static void main(String[] args) throws InterruptedException {

        System.out.println("thread-state:"+thread.getName()+":"+thread.getState());
        thread.start();
        System.out.println("thread-state:"+thread.getName()+":"+thread.getState());
        Thread.sleep(1000);
        System.out.println("thread-state:"+thread.getName()+":"+thread.getState());


        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 1; i++) {
            service.execute(new Task());
        }
        System.out.println(Thread.currentThread().getName());

    }


    static class Task implements Runnable {

        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }

}
