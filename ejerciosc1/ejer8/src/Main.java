// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double anchotel;
        double altotel;
        double pulg;
        screen.println("Ingrese el ancho de su televisor: ");
        anchotel= keyboard.nextDouble();
        screen.println("Ingrese el alto de su televisor: ");
        altotel= keyboard.nextDouble();
        pulg= Math.sqrt(Math.pow(anchotel,2)+Math.pow(altotel,2));
        screen.println("Las pulgadas de su televisor son: "+pulg);
    }
}