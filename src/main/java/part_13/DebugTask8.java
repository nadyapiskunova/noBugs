package part_13;

public class DebugTask8 {
   static double epsilon = 1e-9;
    public static void main(String[] args) {
        double a = 0.1 * 3.0;
        double b = 0.3;
        if (Math.abs(a-b) < epsilon) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
