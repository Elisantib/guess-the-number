import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    //Creamos la variable para nuestro numero aleatorio (main)
    static Random numAleatorio = new Random();
    static int targetNumber = numAleatorio.nextInt(100+1);


    public static void main(String[] args) {

        System.out.println(targetNumber);

        //Damos la bienvenida y solicitamos el nombre (main)
        System.out.println("--Bienvenido al juego 'Adivina el número'--");
        System.out.println("Por favor ingresa tu nombre");

        //entrada para que el jugador ingrese su nombre
        Scanner entrada = new Scanner(System.in);
        String name1 = entrada.nextLine();

        //Se llama al metodo de HumanPlayer
        HumanPlayer human = new HumanPlayer(name1);
        String nombreIngresado = human.getName();
        //System.out.println("\n--Round: player " + nombreIngresado + "--");

        //Se llama al metodo de ComputerPlayer
        ComputerPlayer computer = new ComputerPlayer("Computadora");
        String nombreIngresado2 = computer.getName();


        boolean numFalse = false;
        boolean numFalse2 = false;

        do {
            numFalse = GuessTheNumber.checkGuess(human);

            if(!numFalse) {
                numFalse2 = GuessTheNumber.checkGuess(computer);

                if (numFalse2) {
                    //System.out.println("ganador2");
                    break;
                }
            }
        } while (!numFalse);

        if (numFalse) {
            System.out.println("\u001B[31m" + "\n" + "Felicitaciones " + nombreIngresado + "!, tus intentos fueron: " + human.getGuesses());
        } else {
            System.out.println("\u001B[31m" + "\n" + "Felicitaciones " + nombreIngresado2 + "!, tus intentos fueron: " + computer.getGuesses());
        }



    }

     static boolean checkGuess(Player player){

        int numeroNuevo = player.makeGuess();
        //System.out.println(numeroNuevo);

        if(numeroNuevo > targetNumber){
            System.out.println("--Player " + player.getName() + "--" + "\nTu número es muy alto");

            return false;
        }else if(numeroNuevo < targetNumber){
            System.out.println("--Player " + player.getName() + "--" + "\nTu número es muy bajo");

            return false;
        } else {

            return true;
        }

    }


}