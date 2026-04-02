package part_1;

public class MathOperations {
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiplay(int x, int y){
        return x * y;
    }
    public static double divide(int x, int y){
        if(y == 0){
            return 0;
        }
        return (double) x / y;
    }
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(subtract(5, 4));
        System.out.println(multiplay(5,4));
        System.out.println(divide(3,2));
    }
}
