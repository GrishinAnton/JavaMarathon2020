package Final;

import java.util.List;

public class Player {
    String name;
    PlayerField playerField;
    List<Ship> playerShips;

    public Player(String name){
        this.name = name;
    }

    public void setPlayerField(PlayerField playerField) {
        this.playerField = playerField;
    }

    public void setPlayerShips(List<Ship> playerShips) {
        this.playerShips = playerShips;
    }

    public String getName() {
        return name;
    }

    public PlayerField getPlayerField() {
        return playerField;
    }

    public List<Ship> getPlayerShips() {
        return playerShips;
    }
}
