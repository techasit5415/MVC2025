package Models;

public class CannedFood {
    String Type;
    public void setType(String type) {
        Type = ReadCSV.getType();
    }
    public CannedFood(){
        setType(Type);
        if (Type.equals("Canned Food")){
            System.out.println("CannedFood");
        }
    }
}
