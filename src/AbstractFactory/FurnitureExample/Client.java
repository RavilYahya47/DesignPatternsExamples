package AbstractFactory.FurnitureExample;

public class Client {
    String furnitureType;
    FurnitureFactory furniture;

    public Client(String furnitureType){
        this.furnitureType=furnitureType;
    }

    public void buyFurniture() throws Exception {
        if(furnitureType.equals("Modern"))
            furniture=new ModernFurnitureFactory();
        else if (furnitureType.equals("Victorian"))
            furniture=new VictorianFurnitureFactory();
        else throw new Exception("Unexpected Furniture Type");
    }
}
