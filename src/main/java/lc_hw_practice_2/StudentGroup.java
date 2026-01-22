package lc_hw_practice_2;

public class StudentGroup {
    String groupName;
    int studentCount;
    StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }
    String getGroupName(){
        return groupName;
    }
    int getStudentCount(){
        return studentCount;
    }
    void setGroupName(String newGroupName){
        groupName = newGroupName;
    }
    void setStudentCount(int newStudentCount){
        studentCount = newStudentCount;
    }
    void printInfo(){
        System.out.println("Название группы: " + getGroupName() + ", количество студентов: " + getStudentCount());
    }
}
