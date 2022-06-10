package AbstractFactory.FurnitureExample;

public class FurnitureOrder {
    Chair chair;
    Table table;
    Sofa sofa;
    FurnitureFactory factory;

    public FurnitureOrder(FurnitureFactory furnitureFactory) {
        factory=furnitureFactory;
    }

    public void createFurnitures(){
        chair= factory.createChair();
        table= factory.createTable();
        sofa=factory.createSofa();
        System.out.println("Furnitures Ordered!\n" + "Table: " + table.getClass() + "\nSofa: " + sofa.getClass() + "\nChair: " + chair.getClass());
    }


}
