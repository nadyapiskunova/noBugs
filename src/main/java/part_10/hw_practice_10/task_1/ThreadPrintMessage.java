package part_10.hw_practice_10.task_1;

public class ThreadPrintMessage implements Runnable {
    private final String message;
    private final int count;

    public ThreadPrintMessage(String message, int count){
        this.message = message;
        this.count = count;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < count; i++){
            System.out.println(message);
        }

    }

}
