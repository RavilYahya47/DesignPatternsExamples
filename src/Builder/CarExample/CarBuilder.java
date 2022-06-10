package Builder.CarExample;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seatNumber) {
        this.car.setSeatNumber(seatNumber);
        System.out.println(seatNumber + " seats installed on CAR.");
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
        System.out.println("Engine installed on CAR.");
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.car.setTripComputer(hasTripComputer);
        System.out.println("Trip Computer installed.");
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.car.setGPS(hasGPS);
        System.out.println("GPS installed");
    }

    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
