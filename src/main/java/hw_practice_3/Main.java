package hw_practice_3;

public class Main {
    public static void main(String[] args) {
        /**
        Company.companyName = "Apple";
        Company employee1 = new Company(1, "Ivan");
        System.out.println(employee1.employeeID + " " + employee1.getEmployeeName() + " " + Company.companyName);
        Company employee2 = new Company(2, "Maria");
        System.out.println(employee2.employeeID + " " + employee2.getEmployeeName() + " " + Company.companyName);
        Company.companyName = "Meta";
        System.out.println(employee1.employeeID + " " + employee1.getEmployeeName());
        Company.printCompanyName();
        System.out.println(employee2.employeeID + " " + employee2.getEmployeeName());
        Company.printCompanyName();

         MathConstants.calculateCircleArea(4);
         MathConstants.calculateCircumference(6);

        University st1 = new University(1, "Ivan");
        University st2 = new University(2, "Maria");
        University st3 = new University(3, "Petr");
        University.changeUniversityName("SPGU");
        st1.printStudentInfo();
        st2.printStudentInfo();
        st3.printStudentInfo();

        GameSettings game1 = new GameSettings("Game1", 3);
        GameSettings game2 = new GameSettings("Game2", 6);
        GameSettings.setMaxPlayers(5);
        game1.addPlayer();
        game1.printGameStatus();
        game2.addPlayer();
        game2.printGameStatus();
         **/
        Person p1 = new Person("Ivan", "Ivanov", "123-45-6789");
        Person p2 = new Person("Petr", "Petrov", "132-54-6798");
        Person p3 = new Person("Ivanova", "Anna", "122-45-6789");
        p1.setFirstName("Vanya");
        p1.printPersonInfo();
        p2.printPersonInfo();
        p3.printPersonInfo();






    }
}
