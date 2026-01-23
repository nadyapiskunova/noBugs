package practice_3;

public class Main {
    public static void main(String[] args) {
        // создала переменную
        // присвоила переменной экземпляр класс Студент
        // вызвав дефолтный конструктор

        System.out.println(Student.studentCount);

        Student petya = new Student(18, "Petya");
        int k;

        System.out.println(Student.studentCount);

        Student kolya = new Student(20, "Kolya");

        System.out.println(Student.studentCount);

        /**
        System.out.println(petya.age);
        System.out.println(kolya.age);
        System.out.println(Student.maxYears);
        Student.printMaxYears();
         **/

    }
}
