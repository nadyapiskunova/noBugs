package practice_2;

public class Student {
    int age = 12;
    String name = "Петя";

    Student(int someAge, String someName){
        this.age = someAge;
        this.name = someName;
    }

    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }

    void setAge(int newAge){
        age = newAge;
    }

    void setName(String newName){
        name = newName;
    }

    void print(){
        System.out.println("Возраст " + this.age + ", имя " + this.name);
    }


}
