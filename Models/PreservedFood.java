package Models;

public class PreservedFood {
    String Type;
    public void setType(String type) {
        Type = ReadCSV.getType();
        
    }
    public PreservedFood(){
        setType(Type);
        if (Type.equals("Preserved Food")){
            System.out.println("PreservedFood");
        }
    }
}
