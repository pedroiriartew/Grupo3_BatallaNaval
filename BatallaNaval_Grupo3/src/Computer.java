import java.util.Random;

public class Computer extends User{
	//constructor de la computadora
		public Computer() {
			this.name= "PC";
			mainBoard= new TableroP(); 			//tablero se inicializa, crea la flota y la coloca en tablero
		
		}
		
		public String getName() {
			return name;
		}

		@Override
		public Coordinate makeCoordinate() {
			Random random= new Random();
            
			int posX= random.nextInt(10);
			int posY= random.nextInt(10);

			return new Coordinate(posX, posY);
		}
		
		
}
