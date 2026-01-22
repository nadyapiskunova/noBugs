package lc_hw_practice_2;

public class Rectangle {
    int width, height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    int getWidth(){
        return width;
    }
    int getHeight(){
        return height;
    }
    void setWidth(int newWidth){
        width = newWidth;
    }
    int calculateArea(){
        return getHeight() * getWidth();
    }
}
