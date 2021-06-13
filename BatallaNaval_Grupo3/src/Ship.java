import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    private List<Coordinate> coordinates = new ArrayList<>();

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void addCoordinate(Coordinate coord)
    {
        this.coordinates.add(coord);
    }

    public abstract int getSize();

    public abstract String getName();

    public void setHit(Coordinate coord) {
        this.coordinates.forEach(c-> { 
            if(c.getX() == coord.getX() && c.getY() == coord.getY())
                c.setHit(true);
        });
    }

    public String getShipState()
    {
        return coordinates.stream().filter(c-> c.isHit()).count() != getSize()? "Averiado" : "Hundido";
    }
}
