package lc_hw_practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }
    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }
    void addPlayer(){
        if (currentPlayers > maxPlayers){
            currentPlayers++;
        }
    }
    void printGameStatus(){
        System.out.println("Название игры: " + gameName + ", " +
                "Текущее кол-во игроков: " + currentPlayers + ", " +
                "Максимальное кол-во игроков:" + maxPlayers);
    }
}
