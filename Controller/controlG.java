package Controller;

import views.gui;
import Models.ReadCSV;

public class controlG {
    public static void Connect() {
        String a = "0";
        String ID = gui.getInputValue();

        if (a.equals(String.valueOf(ID.charAt(0))) && (ID.length() != 6)) {
            if (a.equals(String.valueOf(ID.charAt(0)))) {
                show("error char 0 begin 0");
            }
            if (ID.length() != 6) {
                show("legth not 6");
            }

        } else {
            if (ID.length() != 6) {
                show("legth not 6");
            } else {
                show("");
                ReadCSV.setTargetID(ID);
                ReadCSV.Read();
            }
        }

    }

    public static void show(String retext) {
        gui.showText(retext);

    }
}
