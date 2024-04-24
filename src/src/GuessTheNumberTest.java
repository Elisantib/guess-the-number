import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {

    @Test
    @DisplayName("La jugadora siempre debe adivinar un número en el rango entre el 1 y 100")
    void range() {

        Player computerPlayer = new ComputerPlayer("Computadora");
        int guesses = computerPlayer.makeGuess();

        assertEquals(true, 0 < guesses);
        assertEquals(true, 100 >= guesses);

    }

    @Test
    @DisplayName("El número de la jugadora debe ser distinto que el número objetivo")
    void different() {

        //instanciar la clase Player e invocar el metodo makeGuess
        //mockear parametro de player
        //configurar mock

        //mockeando al parametro de player
        Player player = Mockito.mock(Player.class);
        Mockito.when(player.makeGuess()).thenReturn(-1);

        boolean result = GuessTheNumber.checkGuess(player);

        assertFalse(result);

    }

    @Test
    @DisplayName("El número de la jugadora debe ser mayor que el número objetivo")
    public void checkGuessHigh(){

        //String number = "-1\n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Player player = Mockito.mock(Player.class);
        Mockito.when(player.makeGuess()).thenReturn(101);

        boolean result = GuessTheNumber.checkGuess(player);

        assertEquals("--Player " + player.getName() + "--" + "\nTu número es muy alto", out.toString().trim());

    }

    @Test
    @DisplayName("El número de la jugadora debe ser menor que el número objetivo")
    public void checkGuessLow(){

        //String number = "-1\n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Player player = Mockito.mock(Player.class);
        Mockito.when(player.makeGuess()).thenReturn(-1);

        boolean result = GuessTheNumber.checkGuess(player);

        assertEquals("--Player " + player.getName() + "--" + "\nTu número es muy bajo", out.toString().trim());

    }

    /*
    @Test
    @DisplayName("El número de la jugadora debe ser igual que el número objetivo")
    void equals() {

        //Mockear targetNumber (El numero aleatorio)
        GuessTheNumber theNumber = Mockito.mock(GuessTheNumber.class);
       // Mockito.when(theNumber.targetNumber).thenReturn(50);

        //Mockear makeGuess (El numero entregado por el jugador)
        Player player = Mockito.mock(Player.class);
        Mockito.when(player.makeGuess()).thenReturn(50);

        boolean result = theNumber.checkGuess(player);
        assertTrue(result);

    } */

}