package part_8.practice_8.generics;

public class Box <T> {
    private T element;

    public void setElement(T element){
        this.element = element;
    }

    public T getElement(){
        return this.element;
    }

}
