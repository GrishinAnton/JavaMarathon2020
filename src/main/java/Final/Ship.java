package Final;

import Final.Enums.EShip;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private EShip type;
    private final int life;
    private int hit = 0;
    private boolean isSink = false;
    List<String> shipCords = new ArrayList<>();


    public Ship(EShip type) {
        this.life = type.getFieldCount();
        this.type = type;
    }

    public String addHit() {
        this.hit += 1;

        if (this.hit < this.life) {
            return "Попадание!";
        }
        this.isSink = true;
        return "Утопил!";
    }

    public boolean getIsSink() {
        return this.isSink;
    }

    public int getLife() {
        return life;
    }

    public void setShipCords(List<String> shipCords) {
        this.shipCords = shipCords;
    }
}
