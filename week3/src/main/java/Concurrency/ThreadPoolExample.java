package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {
        int poolSize = 5;
        ExecutorService executor = Executors.newFixedThreadPool(poolSize);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("Task " + (i + 1));
            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
            // Đợi
        }

        System.out.println("Tất cả các công việc đã hoàn thành.");
    }
}

class WorkerThread implements Runnable {
    private String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println("Đang thực hiện " + taskName + " - Thread ID: " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " đã hoàn thành - Thread ID: " + Thread.currentThread().getId());
    }
}

