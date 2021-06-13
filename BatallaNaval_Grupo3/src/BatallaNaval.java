import java.util.Random;
import java.util.Scanner;

public class BatallaNaval {
    // private Usuario player1;
    // private Usuario player2;

    Scanner scan = new Scanner(System.in);
    int option = -1;

    public void gameMenu()
    {
        while(option != 0)
        {
            System.out.println("Ingrese el modo de juego.");
            System.out.println("\n1)Jugador contra IA");
            System.out.println("\n2)IA contra IA");

            option = scan.nextInt();

            switch (option) {
                case 1:

                    //startGame(new Jugador(), new Computadora());//Nombre Provisional

                    //Acá quizás vaya una función que permita volver al menu luego de finalizada la partida
                    break;
            
                case 2:

                    //startGame(new Computadora(), new Computadora());//Nombre Provisional
                    
                    //Acá quizás vaya una función que permita volver al menu luego de finalizada la partida
                    break;
            
                default:
                    System.out.println("\n la opcion brindada no existe, seleccione nuevamente.");
                    break;
            }
        }
    }

    private void startGame()//Usuario player1, Usuario player2
    {
        // this.player1 = player1;
        // this.player2 = player2;
        boolean winner = false;
        boolean missedShot = false;

        while (!winner) {
            System.out.println("Turno jugador 1"); // o bien ponemos el nombre
            while (!missedShot) {
                //missedShot = playerMissedShot(player1);

                // if (!missedShot && player2.flota == 0) {
                //     //winner = anounceWinner(player1);
                // }
            }

            System.out.println("Turno jugador 2"); // o bien ponemos el nombre
            missedShot = false;

            while (!missedShot && !winner)//Acá la condición cambia porque es necesario saber si el jugador1 ganó
            {
                //missedShot = playerMissedShot(player2);

                // if (!missedShot && player1.flota == 0) {
                //     //winner = anounceWinner(player2);
                // }
            }
        }
    }

    // private boolean playerMissedShot(Usuario player) {
    //     return player.disparar()? true : false;
    // }

    // private boolean anounceWinner(Usuario player) {
    //     System.out.println("El jugador " + player.name + " es el ganador.");
    //     System.out.println("Su flota aún mantiene " + player.flota.length + " embarcaciones.");

    //     return true;
    // }    
}
