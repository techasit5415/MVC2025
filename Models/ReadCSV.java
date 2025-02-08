package Models;

import java.io.*;
import Controller.controlG;

public class ReadCSV {
    private static String targetID;
    private static String finalString = "Not Found"; // ค่าเริ่มต้น
    private static String Type;
    public static void Read() {
        String csvFile = "C:\\Users\\techa\\OneDrive\\เอกสาร\\webTEST\\MVC2025\\FoodDataBase.csv";
        String line;
        String delimiter = ",";
        String id;
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            boolean found = false;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(delimiter);
                id = (values[0].trim());
                Type =(values[2].trim());
                // System.out.println("ID: " + id);

                if (id.equals(targetID)) {
                    StringBuilder result = new StringBuilder();
                    for (String value : values) {
                        result.append(value.trim()).append(" | ");
                    }
                    finalString = result.toString();

                    found = true;
                    controlG.show(finalString);
                    new CannedFood();
                    new FreshFood();
                    new PreservedFood();
                    break;
                }

            }
            if (!found) {
                finalString = "ID " + targetID + " not found.";
                controlG.show(finalString);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setTargetID(String targetID) {
        ReadCSV.targetID = targetID;
    }

    public static String getFinalString() {
        return finalString;
    }

    public static String getType() {
        return Type;
    }

  
    
}
