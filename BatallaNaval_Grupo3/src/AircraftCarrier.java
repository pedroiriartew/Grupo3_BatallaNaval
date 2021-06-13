public class AircraftCarrier extends Ship {
    private static final int SIZE = 4;
    private static final String NAME = "Portaaviones";

    @Override
    public int getSize() {
        return SIZE;
    }
    @Override
    public String getName() {
        return NAME;
    }
}
