package part_1;

public class AllTaskMain {
    public static int findMax(int a, int b){
        return Math.max(a, b);
    }
    public static int difference(int x, int y){
        return Math.abs(x - y);
    }
    public static int squareArea(int side){
        return side * side;
    }
    public static int squarePerimeter(int side){
        return side + side;
    }

    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time){
        return distance / time;
    }

    public static double findHypotenuse(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double circumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part){
        return (part * 100) / total;
    }

    public static double celsiusToFahrenheit(double c){
        return (9.0 / 5.0) * c + 32;
    }

    public static double fahrenheitToCelsius(double f){
        return (f - 32) * (5.0 /9.0);
    }
    public static void main(String[] args) {
        System.out.println(findMax(3,5));
        System.out.println();

        System.out.println(difference(3,5));
        System.out.println();

        System.out.println(squareArea(5));
        System.out.println(squarePerimeter(5));
        System.out.println();

        System.out.println(convertSecondsToMinutes(230));
        System.out.println();

        System.out.println(averageSpeed(100, 20));
        System.out.println();

        System.out.println(findHypotenuse(2, 2));
        System.out.println(findHypotenuse(3, 2));
        System.out.println(findHypotenuse(5, 4));
        System.out.println();

        System.out.println(circumference(4));
        System.out.println();

        System.out.println(calculatePercentage(200, 13));
        System.out.println();

        System.out.println(celsiusToFahrenheit(20));
        System.out.println(fahrenheitToCelsius(112));
    }
}
