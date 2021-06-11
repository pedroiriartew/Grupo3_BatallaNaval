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
		fleet.getShips().forEach(e->positionShip(e));
	}

	private void positionShip(Boat e) {
		Random rand = new Random();
		int x = rand.nextInt(TAMANIO_X)+1;
		int y = rand.nextInt(TAMANIO_Y)+1;

		if (Math.random() > 0.5) {
			System.out.println("Posicion Vertical");
		}
		else
		{
			System.out.println("Posicion Horizontal");
		}


	}
}