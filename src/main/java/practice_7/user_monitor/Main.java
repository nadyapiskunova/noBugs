package practice_7.user_monitor;

public class Main {
    public static void main(String[] args) {
        UserMonitor um = new UserMonitor();

        um.addNewSession("1777");
        um.addNewSession("1777");
        um.addNewSession("1777");
        um.addNewSession("1777");
        um.addNewSession("1777");
        um.addNewSession("1345");
        um.addNewSession("1345");
        um.addNewSession("1345");
        um.addNewSession("1345");
        um.addNewSession("1345");

        um.printSession();
    }
}
