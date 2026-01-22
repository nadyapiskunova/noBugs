package hw_practice_2;

public class Point {
    int x, y;
    Point( int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void setX(int newX){
        x = newX;
    }
    void print(){
        System.out.println("Значение координаты Х: " + getX() + "; Значение координаты Y: " + getY());
    }


}
