package lc_hw_practice_2;

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
    double calculateArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }
    double calculateCircumference(){
        return 2 * Math.PI * getRadius();
    }
}
