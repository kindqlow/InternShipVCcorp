package Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class IncrementTask implements Runnable {
    private Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

class DecrementTask implements Runnable {
    private Counter counter;

    public DecrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            counter.decrement();
        }
    }
}

public class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public void decrement() {
        count.decrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}


