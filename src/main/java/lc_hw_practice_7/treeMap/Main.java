package lc_hw_practice_7.treeMap;

public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.addScore("Musa", 87);
//        task1.addScore("Leyla", 78);
//        task1.addScore("Flora", 93);
//        task1.addScore("Bloom", 92);
//        task1.addScore("Stella", 89);
//
//        task1.printScores();

//        Task2 task2 = new Task2();
//
//        task2.addUser(1, "Flora");
//        task2.addUser(3, "Musa");
//        task2.addUser(5, "Bloom");
//        task2.addUser(2, "Leyla");
//
//        task2.printMaxAndMinKey();

        Task3 task3 = new Task3();
        task3.addEmployee(1, "Musa");
        task3.addEmployee(32, "Flora");
        task3.addEmployee(99, "Bloom");
        task3.addEmployee(3, "Leyla");
        task3.addEmployee(45, "Stella");

        task3.findNearestHigherId(3);
    }
}
