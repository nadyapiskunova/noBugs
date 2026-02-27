package lc_hw_practice_8.generics.task_2;

public class Main {

    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] winx = {"Bloom", "Flora", "Stella"};
        printArray(winx);

        Integer[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);

    }
}
