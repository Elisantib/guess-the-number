import java.util.ArrayList;
import java.util.Scanner;

public abstract class Player {
    //Las clases abstactas sirven como un tipo de plantilla para otras clases. No se puede instanciar directamente,
    // pero puede tener métodos abstractos y métodos concretos

    //Atributos
    private String name;
    protected ArrayList<Integer> guesses;


    //Constructores

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    //Métodos
    public String getName() {
        //El jugador Ingresa su nombre

        return name;
    }

    public abstract int makeGuess();

    public ArrayList<Integer> getGuesses() {

        return guesses;
    }


}
