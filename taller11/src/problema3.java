/*Generar una función que tenga 4 parámetros de tipo decimal y devuelva el 
promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el promedio 
cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio
es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la función se la debe 
llamar desde un método principal. Los parámetros necesarios para llamar a la 
función, deben ser ingresados solicitados al usuario.

 * @author Andrés
 */
import java.util.Scanner;

public class problema3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double a1, a2, b1, b2, prom = 0;

        System.out.print("Ingresar los cuatro parametros de tipo decimal: ");
        a1 = tcl.nextDouble();
        a2 = tcl.nextDouble();
        b1 = tcl.nextDouble();
        b2 = tcl.nextDouble();
        prom(a1, a2, b1, b2, prom);
        tip(prom);
        System.out.println(prom(a1, a2, b1, b2, prom));
    }

    public static double prom(double a1, double a2, double b1, double b2, double prom) {
        return(a1 + a2 + b1 + b2) / 4;
    }

    public static void tip(double prom) {
        if (prom <= 5) {
            System.out.print("Es un promedio regular: ");
        } else if ((prom > 5) && (prom <= 8)) {
            System.out.print("Es un promedio bueno: ");
        } else if ((prom > 8) && (prom <= 9)) {
            System.out.print("Es un promedio muy bueno: ");
        } else {
            System.out.print("Es un promedio sobresaliente: ");

        }

    }
}
/*
run:
Ingresar los cuatro parametros de tipo decimal: 10 8,2 9,1 6
Es un promedio regular: 8.325
BUILD SUCCESSFUL (total time: 8 seconds)
*/