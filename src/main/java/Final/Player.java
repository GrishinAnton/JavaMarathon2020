package Final;

import java.util.List;

public class Player {
    private String name;
    private PlayerField playerField;
    private List<Ship> playerShips;

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
