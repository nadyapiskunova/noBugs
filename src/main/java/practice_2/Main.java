package practice_2;

public class Main {
    public static void main(String[] args) {
        Student petya = new Student(18, "Петя");

        petya.print();

        Student kolya = new Student(20, "Коля");
        kolya.print();

        petya.setName("Антон");
        petya.name = "Антон";
        petya.print();

        kolya.setAge(21);
        kolya.print();
    }
}
