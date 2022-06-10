package FactoryMethod.TravelExample;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client();
        c1.buyTicket(TravelTypes.BUS);
    }
}
