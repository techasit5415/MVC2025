package Controller;

import views.gui;
import Models.ReadCSV;

public class controlG {
    public static void Connect() {
        String ID = gui.getInputValue();
        ReadCSV.setTargetID(ID);
        ReadCSV.Read(); // อ่านไฟล์ CSV
    }

    public static void show(String retext) {
        gui.showText(retext); // ส่งข้อมูลไปแสดงใน GUI
    }
}
