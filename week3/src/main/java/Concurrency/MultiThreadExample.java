package Concurrency;

public class MultiThreadExample implements Runnable {
    private int x;
    //private int count;
    public MultiThreadExample(int x) {
        this.x = x;
    }
    
    @Override
    public void run() {
        inc(x);
    }
    
    public void inc(int x) {
        int count = 0;
        for (int index = 0; index < x; index++) {
            count += index;
            System.out.println(Thread.currentThread().getName() + " - value: " + count + " index = " + index);
        }
    }
    
    public static void main(String[] args) {
        // Khởi tạo và chạy 3 luồng
        MultiThreadExample example = new MultiThreadExample(5);
        
        Thread thread1 = new Thread(example, "Thread 1");
        Thread thread2 = new Thread(example, "Thread 2");
        Thread thread3 = new Thread(example, "Thread 3");
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
