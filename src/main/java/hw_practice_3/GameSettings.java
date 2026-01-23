package hw_practice_3;

public class GameSettings {
    static int maxPlayers;
    final String nameGame;
    int currentPlayers;

    GameSettings (String nameGame, int currentPlayers){
        this.nameGame = nameGame;
        this.currentPlayers = currentPlayers;
    }
    static void setMaxPlayers(int newMaxPlayer){
        maxPlayers = newMaxPlayer;
    }
     void addPlayer(){
        if (maxPlayers > currentPlayers) {
            currentPlayers ++;
        }
    }
    void printGameStatus(){
        System.out.println(nameGame + " " + currentPlayers + " " + maxPlayers);
    }


}
