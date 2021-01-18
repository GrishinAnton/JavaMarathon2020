package Final.Enums;

public enum FieldCell {
    EMPTY("⬜"),
    OREOL("\uD83D\uDFE6"),
    HIT("\uD83D\uDFE5"),
    SHIP("\uD83D\uDEA2");

    private String translate;

    FieldCell(String translate){
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }
}
