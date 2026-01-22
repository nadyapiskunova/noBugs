package hw_practice_2;

public class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    double calculateArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    double calculateCircumference(double radius){
        return 2 * Math.PI * radius;
    }




}
