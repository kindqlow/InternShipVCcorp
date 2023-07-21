package Concurrency;

public class AtomicCounterExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Tạo hai luồng đồng thời thực hiện tăng và giảm giá trị đếm
        Thread incrementThread = new Thread(new IncrementTask(counter));
        Thread decrementThread = new Thread(new DecrementTask(counter));

        incrementThread.start();
        decrementThread.start();

        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Giá trị cuối cùng của đếm: " + counter.getCount());
    }
}