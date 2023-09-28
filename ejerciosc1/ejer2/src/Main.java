import java.io.PrintStream;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long celular;
        int indicador;
        long temporal;

        screen.println("ingrese un numero celular");
        celular = keyboard.nextLong();
        temporal = (celular)/10000000;
        indicador = Math.toIntExact(temporal);
        screen.println("el indicativo es: "+indicador);

    }

}