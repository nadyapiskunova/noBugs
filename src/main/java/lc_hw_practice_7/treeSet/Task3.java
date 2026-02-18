package lc_hw_practice_7.treeSet;

import java.util.TreeSet;

public class Task3 {
    private TreeSet<Integer> numbers = new TreeSet<Integer>();

    public void addNumber(Integer number){
        numbers.add(number);
    }

    public void printNumber(){
        numbers.forEach(
                number -> {
                    System.out.print(number + " ");
                }
        );
        System.out.println();
    }

    public void printHigherAndLowerNumber(Integer number){
        System.out.print("Ближайшее наибольшее число к заданному числу: " + numbers.higher(number));
        System.out.println();
        System.out.print("Ближайшее наименьшее число к заданному числу: " + numbers.lower(number));
    }
}
