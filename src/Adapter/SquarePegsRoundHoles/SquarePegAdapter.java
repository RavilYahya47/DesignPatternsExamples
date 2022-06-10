package Adapter.SquarePegsRoundHoles;

public class SquarePegAdapter extends RoundPeg{

    private SquarePeg peg;

    public SquarePegAdapter( SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int)(peg.getWidth() * Math.sqrt(2) / 2);
    }
}
