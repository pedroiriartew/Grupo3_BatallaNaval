
import java.util.Scanner;

public class Player extends User {
	public Coordinate c;
		
		//constructor del jugador
	public Player(String username) {
		setName(username);
		mainBoard= new TableroP();		//tablero se inicializa, crea la flota y la coloca en tablero
	}
	
	
	
	public void setName(String username) {
		this.name=username;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public Coordinate makeCoordinate() {						// formato G5 o A1 
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingrese la coordenada para su disparo");
		String coord= scan.nextLine();
		c= convertCoordinate(coord);
		if((c.getX()==-1) | (c.getY()==-1)){
			System.out.println("Coordenada invalida, ingrese otra");
			coord= scan.nextLine();
			c= convertCoordinate(coord);
		}
		scan.close();
		return c;
	}



	private Coordinate convertCoordinate(String coord) {
		String s="ABCDEFGHIJ";
		String e="123456789"+"10";
		Character x= coord.charAt(0); 			//obtengo la fila
		Character y= coord.charAt(1);			//obtengo la columna
		int posx= s.indexOf(x);				//obtengo la posicion
		int posy= e.indexOf(y);			
		c= new Coordinate(posx,posy);
		//DEVUELVE LOS VALORES REALES DE LAS POSICIONES A LAS QUE VAMOS A DISPARAR
		return c;
	}

}