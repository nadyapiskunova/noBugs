package part_10.lc_hw_practice_10.task_4;

public class Count {

    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();

        Thread t1 = new Thread(() ->{
           for (int i = 0; i < 1000; i++){
               counter.increment();
           }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }

}
