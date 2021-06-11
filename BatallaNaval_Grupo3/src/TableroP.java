import java.util.ArrayList;
import java.util.List;

//boat:barco, panel:tablero, columns:columnas 

public class TableroP{
	private static final int TAMANIO_X = 10;
	private static final int TAMANIO_Y = 10;
	
<<<<<<< HEAD
	private Character [][] panel= new Character [TAMANIO_X][TAMANIO_Y];
	private List<Boat> fleet = new ArrayList<>();
=======
	private Character [][] panel= new Character [10][10];
	private Fleet fleet = new Fleet();		//flota
>>>>>>> 7f2a39fc74ab742e9c2471332f3d8b132a30ec07
	
	
	//constructor- inicializa el tablero
	public TableroP() {
		for(int i=0; i<panel.length;i++) {
			for(int j=0; j<panel.length; j++) {
				panel[i][j]= ' ';
			}
		}
	}
	
	
	//c es la coordenada (x,y)
	private boolean validateCoordinate(Coordinate c) {
		return (c.getX()>= 1 && c.getX()<= panel.length) && (c.getY()>= 1 && c.getY()<= panel.length);
	}
	
<<<<<<< HEAD
	private void disparar (Coordinate c) {

		if(validateCoordinate(c)) {
			
			if((panel[c.getX()-1][c.getY()-1]) == ' ')
			{
				//TODO generar impactos
			}
		 }
			
	}
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
					sb.append("("+ panel[i][j]+")\t");
			}
		}
		return sb.toString();
	}
}