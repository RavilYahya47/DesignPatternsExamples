package AbstractFactory.FurnitureExample;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
