import java.util.ArrayList;
import java.util.Random;

public class ComputerPlayer extends Player{
    // Esta clase puede acceder al método "makeGuess()" de la clase Player
    // sin necesidad de redefinirlo.

    //Atributos
    private Random numAleatorio = new Random();

    //constructores
    public ComputerPlayer(String name) {
        super(name);
    }


    //anotación q' indica q' un método en una subclase está sobrescribiendo un método en su superclase
    @Override
    public int makeGuess() {

        int numGuardado = numAleatorio.nextInt(100 + 1);
        this.getGuesses().add(numGuardado);
        System.out.println("\u001B[34m" + "\n" + "número de la computadora: " + numGuardado);

        return numGuardado;



    }



}
