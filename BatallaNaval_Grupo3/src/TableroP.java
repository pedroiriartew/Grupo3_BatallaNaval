import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//boat:barco, panel:tablero, columns:columnas 

public class TableroP{
	private static final int TAMANIO_X = 10;
	private static final int TAMANIO_Y = 10;
	
<<<<<<< HEAD
	private Character [][] panel= new Character [TAMANIO_X][TAMANIO_Y];
<<<<<<< HEAD
	private List<Boat> fleet = new ArrayList<>();
=======
	private Character [][] panel= new Character [10][10];
	private Fleet fleet = new Fleet();		//flota
>>>>>>> 7f2a39fc74ab742e9c2471332f3d8b132a30ec07
	
	
	//constructor- inicializa el tablero
	public TableroP() {
		for(int i=0; i<panel.length;i++) {
			for(int j=0; j<panel.length; j++) {
=======
	private Fleet fleet = new Fleet();
	

	public TableroP()
	{
		initializePanel();
	}

	public void initializePanel()
	{
		for(int i=0; i<TAMANIO_X;i++) {
			for(int j=0; j<TAMANIO_Y; j++) {
>>>>>>> pedro
				panel[i][j]= ' ';
			}
		}
	}
	
	//c es la coordenada (x,y)
	private boolean validateCoordinate(Coordinate c) {
		return (c.getX()>= 1 && c.getX()<= TAMANIO_X) && (c.getY()>= 1 && c.getY()<= TAMANIO_Y);
	}
<<<<<<< HEAD
	
<<<<<<< HEAD
	private void disparar (Coordinate c) {
=======
>>>>>>> pedro

	public void shoot(Coordinate c)
	{
		hit(c);
	}

	
	private void hit (Coordinate c) {		
		if(validateCoordinate(c)) {
			if (existsBoatInCoordinate(c)) {
				panel[c.getX()-1][c.getY()-1]= '*';
			}
			else{
				panel[c.getX()-1][c.getY()-1] = 'A';
			}
		}
		else
		{
			throw new RuntimeException("La coordenada no está dentro del rango esperado.");
		}
			
	}
<<<<<<< HEAD
=======
	
	//impactar una coordenada en mi tablero
	private void impact (Coordinate c) {					
		 if(validateCoordinate(c)) {					//si la coord es valida
			 if(fleet.thereIsaBoat(c))					//verifico si hay un bote(metodo de la flota)
				 panel[c.getX()-1][c.getY()-1]) = '(*)';
				 else
					 panel[c.getX()-1][c.getY()-1]) = '(A)');
				 //TERMINAR
		 }
			
	}
	
	
	//posicionar embarcaciones:
	private void positionBoat(Coordinate c, Boat boat) {
		boolean validate= validateCoordinate(c);
		if(validate) {							// verificar si c es valida
			if( panel[c.getX()][c.getY()]	== ' ')		//verifico que la pos este vacia					
		}
	}
	
>>>>>>> 7f2a39fc74ab742e9c2471332f3d8b132a30ec07
=======

	private boolean existsBoatInCoordinate(Coordinate c) {
		return fleet.existsBoatInPosition(c);
	}

>>>>>>> pedro
	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t");
		String columns = "ABCDEFGHIJ";
		char[] ch= columns.toCharArray();
		for(char letter: ch) {
			sb.append(" "+letter+ "\t ");
		}
		sb.append("\n");
		for(int i=0; i<panel.length;i++) {
			for(int j=0; j<panel.length; j++) {
				if( j == 0)
					sb.append((i+1)+")\t ("+panel[i][j]+")\t ");
				else
					sb.append("(" + panel[i][j]+")\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public void positionShip()
	{
		fleet.getShips().forEach(e->positionShip(e));
	}

	private void positionShip(Boat e) {
		Random rand = new Random();
		int x = rand.nextInt(TAMANIO_X)+1;
		int y = rand.nextInt(TAMANIO_Y)+1;

		if (Math.random() > 0.5) {
			System.out.println("Posicion Vertical");

			for (int i = 0; i < e.getSize(); i++) {
				Coordinate coord = new Coordinate(x, y + i)
			}
		}
		else
		{
			System.out.println("Posicion Horizontal");
		}


	}
}