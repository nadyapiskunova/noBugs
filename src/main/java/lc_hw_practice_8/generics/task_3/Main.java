package lc_hw_practice_8.generics.task_3;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();

        pair.setElementT("Java");
        pair.setElementU(23);
        System.out.print(pair.getElementT() + " " + pair.getElementU());
    }
}
