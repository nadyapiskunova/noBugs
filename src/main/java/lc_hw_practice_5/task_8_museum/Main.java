package lc_hw_practice_5.task_8_museum;

public class Main {
    public static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        Museum museum = new Museum();

        museum.showInfo(manuscript);
        museum.manageExhibit(manuscript);

        System.out.println();

        museum.showInfo(sculpture);
        museum.manageExhibit(sculpture);

    }
}
