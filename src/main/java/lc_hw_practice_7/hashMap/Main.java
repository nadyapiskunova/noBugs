package lc_hw_practice_7.hashMap;

public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.addPerson("Bloom", 15);
//        task1.addPerson("Leyla", 16);
//        task1.addPerson("Musa", 17);
//        task1.addPerson("Flora", 18);
//        task1.addPerson("Stella", 17);
//
//        task1.printPersons();

//        Task2 task2 = new Task2();
//        task2.addPerson("Bloom", 20);
//        task2.addPerson("Leyla", 21);
//        task2.addPerson("Flora", 19);
//
//        task2.checkName("Bloom");
//        task2.checkName("Musa");

        Task3 task3 = new Task3();

        task3.addUser("Bloom", 15);
        task3.addUser("Musa", 23);
        task3.addUser("Stella", 13);
        task3.addUser("Leyla", 18);

        task3.underageUsers();
    }


}
