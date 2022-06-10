package Builder.CarExample;

public class Car {
    private Engine engine;
    private boolean haveGPS;
    private int seatNumber;
    private boolean haveTripComputer;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isHaveGPS() {
        return haveGPS;
    }

    public void setGPS(boolean haveGPS) {
        this.haveGPS = haveGPS;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isHaveTripComputer() {
        return haveTripComputer;
    }

    public void setTripComputer(boolean haveTripComputer) {
        this.haveTripComputer = haveTripComputer;
    }
}
