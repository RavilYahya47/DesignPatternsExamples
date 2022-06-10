package Builder.CarExample;

public class ManualBuilder implements Builder{
    Manual manual;

    public ManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int seatNumber) {
        this.manual.setSeatNumber(seatNumber);
        System.out.println(seatNumber + " seats installed.");
    }

    @Override
    public void setEngine(Engine engine) {
        this.manual.setEngine(engine);
        System.out.println("Engine installed.");
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.manual.setTripComputer(hasTripComputer);
        System.out.println("Trip Computer installed.");
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.manual.setGPS(hasGPS);
        System.out.println("GPS installed");
    }

    public Manual getProduct(){
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
