package Final;

import Final.Enums.FieldCell;

import java.util.ArrayList;
import java.util.List;


public class PlayerField {
    List<List<FieldCell>> field = new ArrayList<>();

    public PlayerField() {
        List<FieldCell> line = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            line.add(FieldCell.EMPTY);
            if (i % 10 == 0) {
                this.field.add(line);
                line = new ArrayList<>();
            }
        }
    }

    public void addShipToField(String cords) {
        String[] cordsArr = cords.split(GameConfig.SEPARATOR);
        for (int i = 0; i < cordsArr.length; i++) {
            String[] numbersString = cordsArr[i].split(GameConfig.NUMBER_SEPARATOR);

            int x = Integer.parseInt(numbersString[0]);
            int y = Integer.parseInt(numbersString[1]);

            this.field.get(y).set(x, FieldCell.SHIP);
        }
    }

    public boolean checkShipCordsInField(List<String> lineShipPosition) {
        System.out.println(lineShipPosition.toString());
        for (int i = 0; i < lineShipPosition.size(); i++) {
            String[] line = lineShipPosition.get(i).split(GameConfig.SEPARATOR);
            for (int j = 0; j < line.length; j++) {
                String[] numbersString = line[j].split(GameConfig.NUMBER_SEPARATOR);
                int x = Integer.parseInt(numbersString[0]);
                int y = Integer.parseInt(numbersString[1]);
                if (x < 0 || y < 0) continue;
                if (x > 9 || y > 9) continue;
                if (this.field.get(y).get(x) == FieldCell.SHIP) return false;
            }
        }

        return true;
    }


    public void print() {
        for (List<FieldCell> fieldCells : field) {
            for (FieldCell fieldCell : fieldCells) {
                System.out.print(fieldCell.getTranslate());
            }
            System.out.println();
        }
    }
}