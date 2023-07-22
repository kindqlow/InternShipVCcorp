package SafeThread;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Runnable task = new MyDaemonTask();

        Thread daemonThread = new Thread(task);
        daemonThread.setDaemon(true); // Đặt thành daemon thread

        daemonThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyDaemonTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Daemon Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

