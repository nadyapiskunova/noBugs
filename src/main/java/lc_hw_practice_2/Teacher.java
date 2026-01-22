package lc_hw_practice_2;

public class Teacher {
    String name, subject;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    String getName(){
        return name;
    }
    String getSubject(){
        return subject;
    }
    void setName(String newName){
        name = newName;
    }
    void setSubject(String newSubject){
        subject = newSubject;
    }
    void printInfo(){
        System.out.println("Имя учителя: " + getName() + ", название предмета: " + getSubject());
    }
}
