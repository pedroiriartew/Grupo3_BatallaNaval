public class Destroyer extends Ship {
    private static final int SIZE = 2;
    private static final String NAME = "Destructor";

    @Override
    public int getSize() {
        return SIZE;
    }

    @Override
    public String getName() {
        return NAME;
    }
    
}
