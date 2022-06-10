package AbstractFactory.FurnitureExample;

public class Main {
    public static void main(String[] args) throws Exception {
        Client client = new Client("Victorian");
        client.buyFurniture();
        FurnitureOrder order = new FurnitureOrder(client.furniture);
        order.createFurnitures();
    }
}
