package Final;

import java.util.List;

public class Player {
    private String name;
    private PlayerField playerField;
    private List<Ship> playerShips;
    private HashMapShips hashMap;

    public HashMapShips getHashMap() {
        return hashMap;
    }

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

    public void setHashMap(HashMapShips hashMap) {
        this.hashMap = hashMap;
    }

    public List<Ship> getPlayerShips() {
        return playerShips;
    }
}
