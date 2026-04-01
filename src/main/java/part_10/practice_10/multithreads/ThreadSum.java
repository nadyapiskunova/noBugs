package part_10.practice_10.multithreads;

public class ThreadSum implements Runnable{
    // реализовали хранение данных
    private final int[] array;
    private final int start;
    private final int end;
    // реализовали изначальное значение суммы
    private  int sum = 0;

    public ThreadSum(int[] array, int start, int end){
        this.array = array;
        this.start = start;
        this.end = end;
    }
    @Override
    public void run(){
        for (int i = start; i < end; i++){
            sum += array[i];
        }
    }

    public int getSum(){
        return this.sum;
    }
}
