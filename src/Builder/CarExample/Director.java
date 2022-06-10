package Builder.CarExample;

public class Director {
    private Builder builder;

    void setBuilder(Builder builder){
        this.builder = builder;
    }

    void constructSportCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportCarEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
