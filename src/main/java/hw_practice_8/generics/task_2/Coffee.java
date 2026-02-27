package hw_practice_8.generics.task_2;

public class Coffee {
   private String beanSource;

    public Coffee( String beanSource){
        this.beanSource = beanSource;
    }

    public String getBeanSource(){
        return beanSource;
    }

    public String toString(){
        return "{ Происхождение зерен: " + getBeanSource() + " }";
    }


}
