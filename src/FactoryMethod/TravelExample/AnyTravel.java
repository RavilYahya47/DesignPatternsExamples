package FactoryMethod.TravelExample;

public abstract class AnyTravel {
    public static Travel getObject(TravelTypes travelType)
    {
        if (travelType == TravelTypes.BUS)
            return new BusTravel();
        else if (travelType == TravelTypes.TRAIN)
            return new TrainTravel();
        else
            return null;
    }
}
