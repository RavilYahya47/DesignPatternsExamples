package Builder.CarExample;

public class Application {
    static void makeCar(){
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getProduct();


        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportCar(manualBuilder);
        Manual manual = manualBuilder.getProduct();

    }

    public static void main(String[] args) {
        makeCar();
    }
}
