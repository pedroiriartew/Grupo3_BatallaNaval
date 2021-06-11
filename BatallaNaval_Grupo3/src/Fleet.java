import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Fleet {
    List <Boat> ships = new ArrayList<>();

    public List<Boat> getShips() {
        return ships;
    }

    public void setShips(List<Boat> ships) {
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

    public void createFleet()
    {
        //TODO utilizar el shipFactory para crear las embarcaciones
    }

}
