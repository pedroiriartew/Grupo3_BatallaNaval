import java.util.ArrayList;
import java.util.List;

//boat:barco, panel:tablero, columns:columnas 

public class TableroP{
	
	private Character [][] panel= new Character [10][10];
	private Fleet fleet = new Fleet();		//flota
	
	
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
}