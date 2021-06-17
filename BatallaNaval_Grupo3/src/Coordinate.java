
public class Coordinate {
	
	private int x;
	private int y;
	private boolean isHit = false;
	
	public Coordinate(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public static Coordinate convertCoordinate(String coord) {
		String s="ABCDEFGHIJ";
		String e="123456789"+"10";
		Character x= coord.charAt(0); 			//obtengo la fila
		Character y= coord.charAt(1);			//obtengo la columna
		int posx= s.indexOf(x);				//obtengo la posicion
		int posy= e.indexOf(y);			
		Coordinate c = new Coordinate(posx,posy);
		//DEVUELVE LOS VALORES REALES DE LAS POSICIONES A LAS QUE VAMOS A DISPARAR
		return c;
	}

	public String toString(int x, int y) {
		return ("Coordenada: "+ x +"-"+y);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isHit() {
		return isHit;
	}
	
	public void setHit(boolean isHit) {
		this.isHit= isHit;
	}
	
}	

