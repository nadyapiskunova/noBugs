package hw_practice_8.generics.task_1;

public class Box <T>{
    T element;

    public void setElement(T element){
        this.element = element;
    }

    public T getElement(){
        return element;
    }
}
