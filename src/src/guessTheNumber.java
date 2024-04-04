import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {

    public static void main(String[] args) {

        //Creamos la variable para nuestro numero aleatorio (main)
        Random numAleatorio = new Random();
        int targetNumber = numAleatorio.nextInt(100+1);
        System.out.println(targetNumber);

        //Damos la bienvenida y solicitamos el nombre (main)
        System.out.println("--Welcome to the Guess the Number Game--");
        System.out.println("Por favor ingresa tu nombre");



        //Se llama a la clase, sus métodos y sus atributos
        HumanPlayer human = new HumanPlayer();
        String nombreIngresado = human.getName();
        System.out.println("\n--Round: player " + nombreIngresado + "--");
        ArrayList<Integer> numeroIngresado = human.makeGuess();
        ArrayList<Integer> intentos = human.getGuesses(numeroIngresado);

        //Se crea un bucle While para encontrar el numero random creado anteriormente
        while (numeroIngresado.get(0) != targetNumber){

            if ((numeroIngresado.get(0) > targetNumber) || (numeroIngresado.get(0) < targetNumber)){

                if (numeroIngresado.get(0) > targetNumber){
                    System.out.println("--Player " + nombreIngresado + "--" + "\nTu número es muy alto");
                }else {
                    System.out.println("--Player " + nombreIngresado + "--" + "\nTu número es muy bajo");

                }
            } else {
                System.out.println("Turno de la computadora");
            }

            System.out.println("Intenta de nuevo: ");

            Scanner entrada = new Scanner(System.in);
            int intentaDeNuevo = Integer.parseInt(entrada.nextLine());
            intentos.add(intentaDeNuevo);
            //System.out.println(intentos);

            /*
            //Cada numero ingresado por el jugador se guarda en "intentosGuardados"
            intentosGuardados.add(numeroIngresado[0]);
            */

        }

        System.out.println("\u001B[34m" + "FELICIDADES ACERTASTE " + nombreIngresado + "!" + " ADIVINASTE EL NÚMERO.");
        System.out.println("\u001B[34m" + "Intentos: " + intentos );
        System.out.println("Total intentos: " + intentos.size());


        //ComputerPlayer computer = new ComputerPlayer("Computer", 20);
        //System.out.println(computer.getName());

    }


}