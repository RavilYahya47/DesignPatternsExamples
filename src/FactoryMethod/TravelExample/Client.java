package FactoryMethod.TravelExample;

public class Client {
    Travel myTravel;

    Client()
    {

    }

    public Travel getTravel()
    {
        return myTravel;
    }

    public void buyTicket(TravelTypes t)
    {
        myTravel = AnyTravel.getObject(t);
    }
}
