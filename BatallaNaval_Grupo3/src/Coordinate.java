

public class Coordinate {

		private int x;								//filas(letras)
		private int y;								//columnas(numeros)
		private boolean touched =false;				//tocadas
		
		public Coordinate(int x, int y) {		//op1: recibo coordenada verdadera desde el jugador
			this.x = x;
			this.y = y;
		}
		public Coordinate(String c) {			//op: recibo coordenada como un string y la convierto
			String s="ABCDEFGHIJ";
			String e="123456789"+"10";
			Character x1= c.charAt(0);
			Character y1= c.charAt(1);
			this.x = s.indent(x1);
			this.y = e.indexOf(y1);
			//VERIFICAR QUE ANDE. SI TOMAMOS ESTA FORMA HAY QUE MODIFICAR LOS N-1 DEL TABLERO
		}
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x =x-1;			//recibo el valor x del usuario que sera el x-1 del tablero
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {	//recibo el valor n del usuario que sera el n-1 del tablero
			this.y =y;
		}
		public void isTouched() {
			return touched;
		}
		public void setTouched(boolean touched) {
			this.touched= touched;
		}
}
