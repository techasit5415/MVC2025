package Models;

public class FreshFood {
    String Type;
    public void setType(String type) {
        Type = ReadCSV.getType();
        
    }
    public FreshFood(){
        setType(Type);
        if (Type.equals("Fresh Food")){
            System.out.println("FreshFood");
        }
    }
    
}
