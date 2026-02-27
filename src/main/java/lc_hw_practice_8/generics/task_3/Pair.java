package lc_hw_practice_8.generics.task_3;

public class Pair <T,U>{
    private T elementT;
    private U elementU;

    public void setElementT(T elementT){
        this.elementT = elementT;
    }

    public void setElementU(U elementU){
        this.elementU = elementU;
    }

    public T getElementT(){
        return elementT;
    }

    public U getElementU(){
        return elementU;
    }
}
