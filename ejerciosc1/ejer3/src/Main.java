import java.io.PrintStream;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        float horas;
        float valhora;
        float retencion;
        float salbruto;
        float salneto;
        float retfte;

        screen.println("ingrese las horas trabajadas");
        horas = keyboard.nextFloat();
        screen.println("ingrese el valor por hora de trabajo");
        valhora = keyboard.nextFloat();
        screen.println("ingrese el porcentaje de retencion");
        retencion = keyboard.nextFloat();
        salbruto = horas*valhora;
        retfte = salbruto*(retencion/100);
        salneto = salbruto - retfte;
        screen.println("el salario bruto es: "+salbruto+"la retencion en la fuente es: "+ retfte +"el salario neto es: "+ salneto);

    }

}