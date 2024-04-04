import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player{
    // Esta clase puede acceder al método "makeGuess()" de la clase Player sin necesidad de redefinirlo.

    //Constructores
    public HumanPlayer() {
        this.guesses = new ArrayList<>();

    }

    //Metodos
    @Override
    public ArrayList<Integer> makeGuess() {
        /*
        System.out.println("Ingresa un número del 1 al 100");

        //El jugador ingresa su numero como string y luego se transforma a int con parse
        Scanner entrada1 = new Scanner(System.in);
        String numeroElegido = entrada1.nextLine();
        int numeroElegidoConv = Integer.parseInt(numeroElegido);
        ArrayList<Integer> numeroEscogido = new ArrayList<>();
        numeroEscogido.add(numeroElegidoConv);
        */
        return makeGuess();


    }

}
