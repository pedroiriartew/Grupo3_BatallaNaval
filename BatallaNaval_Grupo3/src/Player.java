
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
	public Coordinate makeCoordinate() {						// devuelve la coordenada real
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingrese la coordenada para su disparo");
		String coord= scan.nextLine();
		c= Coordinate.convertCoordinate(coord);
		while((c.getX()==-1) | (c.getY()==-1)){
			System.out.println("Coordenada invalida, ingrese otra");
			coord= scan.nextLine();
			c= Coordinate.convertCoordinate(coord);
		}
		scan.close();
		return c;
	}

}