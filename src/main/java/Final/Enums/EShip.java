package Final.Enums;

public enum EShip {
    XL_SHIP(4),
    L_SHIP(3),
    M_SHIP(2),
    S_SHIP(1);

    private int fieldCount;

    EShip(int fieldCount){
        this.fieldCount = fieldCount;
    }

    public int getFieldCount() {
        return fieldCount;
    }
}
