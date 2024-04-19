import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player{
    // Esta clase puede acceder al método "makeGuess()" de la clase Player sin necesidad de redefinirlo.

    //Constructores
    public HumanPlayer(String name) {
        super(name);
    }

    //Metodos
    @Override
    public int makeGuess() {
        //El jugador ingresa su numero como string y luego se transforma a int con parse
        System.out.println("\u001B[32m" + "\n" + "Por favor ingresa tu número: ");
        Scanner entrada1 = new Scanner(System.in);
        String numeroElegido = entrada1.nextLine();

        int numGuardado = Integer.parseInt(numeroElegido);
        this.getGuesses().add(numGuardado);

        return numGuardado;
    }

}
