import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//boat:barco, panel:tablero, columns:columnas 

public class TableroP{
	private static final int TAMANIO_X = 10;
	private static final int TAMANIO_Y = 10;
	
	private Character [][] panel= new Character [TAMANIO_X][TAMANIO_Y];
	private Fleet fleet = new Fleet();
	

	public TableroP()
	{
		initializePanel();
	}

	public void initializePanel()
	{
		for(int i=0; i<TAMANIO_X;i++) {
			for(int j=0; j<TAMANIO_Y; j++) {
				panel[i][j]= ' ';
			}
		}
	}
	
	//c es la coordenada (x,y)
	private boolean validateCoordinate(Coordinate c) {
		return (c.getX()>= 1 && c.getX()<= TAMANIO_X) && (c.getY()>= 1 && c.getY()<= TAMANIO_Y);
	}

	public void shoot(Coordinate c)
	{
		hit(c);
	}

	
	private String hit (Coordinate c) {	//Quizás esto cambie a boolean
		Ship ship = null;	
		if(validateCoordinate(c)) {
			if (existsBoatInCoordinate(c)) {
				panel[c.getX()-1][c.getY()-1]= '*';
				ship = fleet.getShipAtCoordinate(c);
				ship.setHit(c);
			}
			else{
				panel[c.getX()-1][c.getY()-1] = 'A';
			}
		}
		else
		{
			throw new RuntimeException("La coordenada no está dentro del rango esperado.");
		}

		if (ship == null)
			return "Agua";
		else
			return ship.getShipState();
	}

	private boolean existsBoatInCoordinate(Coordinate c) {
		return fleet.existsBoatInPosition(c);
	}

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
		fleet.getShips().forEach(s->assignCoordinatesToShip(s));
	}

	private void assignCoordinatesToShip(Ship s) {
		Random rand = new Random();
		List<Coordinate> coordList = new ArrayList<>();
		
		while(s.getSize() > coordList.size()){
			int x = rand.nextInt(TAMANIO_X);
			int y = rand.nextInt(TAMANIO_Y);

			if (x + s.getSize() < TAMANIO_X && y + s.getSize() < TAMANIO_Y){
				if (Math.random() > 0.5) {
					System.out.println("Posicion Vertical");
					
					coordList = createVerticalShipPosition(s, coordList, x, y);
				}
				else
				{
					System.out.println("Posicion Horizontal");										
					coordList = createHorizontalShipPosition(s, coordList, x, y);
				}
			}
		}

		coordList.forEach(c->s.addCoordinate(c));
	}

	/*
		Ambas funciones de Create...ShipPosition hacen en esencia lo mismo, por lo que es probable que haya que refactorizarlas
		
	*/
	private List<Coordinate> createHorizontalShipPosition(Ship s, List<Coordinate> coordList, int x, int y) {
		for (int i = 0; i < s.getSize(); i++) {
			Coordinate coord = new Coordinate(x+ i, y);
			if (validateCoordinate(coord) && !fleet.existsBoatInPosition(coord)) {
				coordList.add(coord);
			}
			else{
				coordList = new ArrayList<>();
				break;
			}
		}
		return coordList;
	}

	private List<Coordinate> createVerticalShipPosition(Ship s, List<Coordinate> coordList, int x, int y) {
		for (int i = 0; i < s.getSize(); i++) {
			Coordinate coord = new Coordinate(x, y + i);
			if (validateCoordinate(coord) && !fleet.existsBoatInPosition(coord)) {
				coordList.add(coord);
			}
			else{
				coordList = new ArrayList<>();
				break;
			}
		}
		return coordList;
	}
}