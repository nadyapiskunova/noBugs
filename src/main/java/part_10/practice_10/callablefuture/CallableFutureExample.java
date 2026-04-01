package part_10.practice_10.callablefuture;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureExample {
    // Сложные расчеты днк
    // наша задача дождаться вычисления и получить результат


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> dnaResult = () -> {
            System.out.println("СЛожное вычисление днк");
            Thread.sleep(10000);
            int randomDnaResult = new Random().nextInt();
            return randomDnaResult;
        };

        Future<Integer> future = executorService.submit(dnaResult);


        System.out.println("Результат днк: " + future.get());

        executorService.shutdown();
    }
}
