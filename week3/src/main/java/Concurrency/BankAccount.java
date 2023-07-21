package Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DepositTask implements Runnable {
    private BankAccount account;

    public DepositTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(1000);
        }
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;

    public WithdrawTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(500);
        }
    }
}

public class BankAccount {
    private int balance = 0;
    private Lock lock = new ReentrantLock();

    public void deposit(int amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Đã gửi " + amount + " đồng. Số dư hiện tại: " + balance);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Đã rút " + amount + " đồng. Số dư hiện tại: " + balance);
            } else {
                System.out.println("Không đủ tiền trong tài khoản.");
            }
        } finally {
            lock.unlock();
        }
    }
}




