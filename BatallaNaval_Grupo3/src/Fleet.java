import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Fleet {
    List <Ship> ships = new ArrayList<>();

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    public Fleet()
    {
        createFleet();
    }

	public boolean existsBoatInPosition(Coordinate coord) {
		List<Coordinate> coords = new ArrayList<>();
        ships.forEach(b->coords.addAll(b.getCoordinates()));

        Optional<Coordinate> ship = coords.stream().filter(c-> c.getX() == coord.getX() && c.getY() == coord.getY()).findFirst();

		return ship.isPresent();//Si tiene un valor, devuelve true
	}

    // public void markHit(Coordinate coord)
    // {

    // }
    public void createFleet()
    {
        ships.add(ShipFactory.createShip("Portaaviones"));
        for (int i = 0; i < 2; i++) {
            ships.add(ShipFactory.createShip("Submarino"));
        }
        for (int i = 0; i < 3; i++) {
            ships.add(ShipFactory.createShip("Destructor"));
        }
        for (int i = 0; i < 2; i++) {
            ships.add(ShipFactory.createShip("Fragata"));
        }
        ships.add(ShipFactory.createShip("Acorazado"));
    }

    public Ship getShipAtCoordinate(Coordinate coord)
    {
        Ship ship = null;
        for (Ship boat : ships) {
            for (Coordinate c : boat.getCoordinates()) {
                if (c.getX() == coord.getX() && c.getY() == coord.getY()) {
                    ship = boat;
                }
            }            
        }
        return ship;
    }

}
