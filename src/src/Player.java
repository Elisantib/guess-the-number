import java.util.ArrayList;
import java.util.Scanner;

public abstract class Player {
    //Las clases abstactas sirven como un tipo de plantilla para otras clases. No se puede instanciar directamente,
    // pero puede tener métodos abstractos y métodos concretos

    //Atributos
    private String name;
    protected ArrayList<Integer> guesses;

    //Constructores

    public Player() {
    }
/*
    public Player(String name) {
        this.name = name;
    }
 */

/*
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", guesses=" + guesses +
                '}';
    }

 */

    //Métodos
    public String getName() {
        //El jugador Ingresa su nombre
        Scanner entrada = new Scanner(System.in);
        String name1 = entrada.nextLine();

        return name1;
    }

    public ArrayList<Integer> makeGuess() {
        //System.out.println(guesses);
        return guesses;
    }

    public ArrayList<Integer> getGuesses(ArrayList<Integer> intentos) {


        ArrayList<Integer> suposiciones = intentos;
        //suposiciones = intentos;

        //Se crea array vacio fuera de bucle para guardar aqui todos los numeros ingresados
        ArrayList<Integer> intentosGuardados = new ArrayList<>();

        //Cada numero ingresado por el jugador se guarda en "intentosGuardados"
        intentosGuardados.addAll(suposiciones);

        return intentosGuardados;
    }


}
