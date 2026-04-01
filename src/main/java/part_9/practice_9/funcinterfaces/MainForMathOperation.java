package part_9.practice_9.funcinterfaces;

public class MainForMathOperation {
    public static void main(String[] args) {
        MathOperations add = (x, y) -> x + y;
        MathOperations substract = (x, y) -> x - y;
        MathOperations multiplay = (x, y) -> x * y;
        MathOperations divide = (x, y) -> x / y;

        System.out.println(add.apply(2,3));
        System.out.println(substract.apply(10,7));
        System.out.println(multiplay.apply(8,3));
        System.out.println(divide.apply(15,5));

    }
}
