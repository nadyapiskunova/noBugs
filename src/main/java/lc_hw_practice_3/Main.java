package lc_hw_practice_3;

public class Main {
    public static void main(String[] args) {
        /**
        Company c1 = new Company(1, "Ivan");
        Company c2 = new Company(2, "Petr");
        Company.companyName = "Apple";
        Company.printCompanyName();
        System.out.println(c1.employeeID + " " + c1.getEmployeeName() + " ");
        System.out.println(c2.employeeID + " " + c2.getEmployeeName() + " ");
        Company.companyName = "Microsoft";
        Company.printCompanyName();
        System.out.println(c1.employeeID + " " + c1.getEmployeeName() + " ");
        System.out.println(c2.employeeID + " " + c2.getEmployeeName() + " ");

        MathConstants.calculateCircleArea(3);
        MathConstants.calculateCircumference(5);

        Library lib = new Library();
        // lib.bookTitle;
        lib.author = "";
        lib.year = 1;
        lib.category = "";

        University st1 = new University(1, "Ivan");
        University st2 = new University(2, "Petr");
        University st3 = new University(3, "Anna");
        University.universityName = "MGU";
        University.changeUniversityName("SPBGU");
        st1.printStudentInfo();
        st2.printStudentInfo();
        st3.printStudentInfo();

        GameSettings game1 = new GameSettings("Game1", 4);
        GameSettings game2 = new GameSettings("Game2",5);
        GameSettings.setMaxPlayers(5);
        game1.printGameStatus();
        game2.printGameStatus();
         **/
        Person p1 = new Person("Ivan", "Ivanov", "123-45-6789");
        Person p2 = new Person("Petr", "Petrov", "122-45-6789");
        Person p3 = new Person("Anna", "Ivanova", "111-45-6789");
        p1.setFirstName("Vanya");
        p1.printPersonInfo();
        p2.printPersonInfo();
        p3.printPersonInfo();


    }
}
