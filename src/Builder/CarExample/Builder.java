package Builder.CarExample;

public interface Builder {
    void reset();
    void setSeats( int seatNumber);
    void setEngine(Engine engine);
    void setTripComputer(boolean hasTripComputer);
    void setGPS( boolean hasGPS);
}
