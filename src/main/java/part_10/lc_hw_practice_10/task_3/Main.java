package part_10.lc_hw_practice_10.task_3;

public class Main {
    public static volatile boolean stop;
    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
           while (!stop){
               count++;
           }
        });

        t1.start();

        Thread.sleep(2000);

        stop = true;
        t1.join();

        System.out.println(count);
    }
}
