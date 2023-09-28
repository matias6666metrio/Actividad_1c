import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int Num1 = 0;
        int Num2 = 0;
        int Res = 0;

        screen.println("ingrese un numero entero");
        Num1 = keyboard.nextInt();

        screen.println("ingrese otro numero entero");
        Num2 = keyboard.nextInt();

        Res = Num1*Num2;
        screen.println("el resultado de la multiplicacion es: "+Res);

    }


}