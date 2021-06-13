public class ShipFactory {
    
    public static Ship createShip(String shipType)
    {
        Ship s = null;
        
        if ("Acorazado".equalsIgnoreCase(shipType))
            s = new Battleship();
        if ("Destructor".equalsIgnoreCase(shipType))
            s = new Destroyer();
        if ("Fragata".equalsIgnoreCase(shipType))
            s = new Frigate();
        if ("Submarino".equalsIgnoreCase(shipType))
            s = new Submarine();
        if ("Portaaviones".equalsIgnoreCase(shipType))
            s = new AircraftCarrier();

        return s;
    }
}
