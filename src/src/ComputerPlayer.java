import java.util.ArrayList;
import java.util.Random;

public class ComputerPlayer extends Player{
    // Esta clase puede acceder al método "makeGuess()" de la clase Player
    // sin necesidad de redefinirlo.

    //Atributos
    private Random numAleatorio = new Random();
    private int numeroAl = numAleatorio.nextInt(100+1);

    //constructores
    public ComputerPlayer() {
        this.guesses = new ArrayList<>();
    }
    public ComputerPlayer(int numeroAl) {
        this.numeroAl = numeroAl;
    }


    //anotación q' indica q' un método en una subclase está sobrescribiendo un método en su superclase
    /*
    @Override
    public int[] makeGuess() {
        return super.makeGuess();
    }
     */


}
