import java.io.PrintStream;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

    int numero=0;
    int resultado=0;

    screen.println("ingrese un numero");
    numero = keyboard.nextInt();
    resultado = numero%2;
    screen.println("el residuo de la division por 2 es"+resultado);

    }

}