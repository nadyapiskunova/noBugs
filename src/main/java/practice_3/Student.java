package practice_3;

public class Student {
    final static int MAX_YEARS = 11;
    static int studentCount;

    static {
        studentCount = 0;
    }

    private int age;
    String name;
    Student(int someAge, String someName){
        this.age = someAge;
        this.name = someName;
        studentCount ++;
    }

    static void printMaxYears(){
        System.out.println(MAX_YEARS);
    }
}
