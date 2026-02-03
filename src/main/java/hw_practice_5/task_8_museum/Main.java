package hw_practice_5.task_8_museum;

public class Main {
    public static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        Museum museum = new Museum();

        museum.manageExhibit(manuscript);
        museum.showInfo(manuscript);
        System.out.println();
        museum.manageExhibit(sculpture);
        museum.showInfo(sculpture);

    }
}
