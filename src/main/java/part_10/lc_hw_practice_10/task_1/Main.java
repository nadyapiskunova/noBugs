package part_10.lc_hw_practice_10.task_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadPrintMessage threadPrintMessage = new ThreadPrintMessage("Привет из потока!", 5);

        Thread t1 = new Thread(threadPrintMessage);

        t1.start();
        t1.join();
    }
}
