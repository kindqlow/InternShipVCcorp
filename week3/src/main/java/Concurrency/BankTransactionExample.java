package Concurrency;

public class BankTransactionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Tạo hai luồng đồng thời thực hiện gửi và rút tiền
        Thread depositThread = new Thread(new DepositTask(account));
        Thread withdrawThread = new Thread(new WithdrawTask(account));

        depositThread.start();
        withdrawThread.start();
    }
}
