public abstract class User {
    protected String name;
    protected TableroP mainBoard; //el tablero del rival deberia imprimirse desde el tablero principal de mi oponente sin mostrar sus barcos
    
    public String getUsername() {
        return name;
    }
    
    public abstract Coordinate makeCoordinate();
}
