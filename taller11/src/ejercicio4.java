/*Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento 
para calcular el valor del predio de un bien inmueble. Cada procedimiento debe tener 2 parámetros
(tipo cadena para nombre del cliente, cédula del cliente).
En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y 
el número de kilowatios del mes. Y se genera en pantalla el siguiente reporte: Cliente 
Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener
el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:
Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000
y tiene que pagar de predio $ 600.
En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 
2 se llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se 
los debe ingresar por teclado.
 * @author Andrés
 */
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String n, p;
        int val, cel;
        double valo, num, inm;
        System.out.print("Ingrese su nombre y apellido: ");
        n = tcl.next();
        p = tcl.next();
        System.out.println("Ingresar cedula: ");
        cel = tcl.nextInt();
        System.out.printf("%s%n%s%n%s%n", "Desea", "(1) pagar luz", "(2) pagar predio");
        val = tcl.nextInt();
        switch (val) {
            case 1:
                System.out.println("Dame le valor del kilowatio y el numero del kilowatio usado en el mes");
                valo = tcl.nextDouble();
                num = tcl.nextDouble();
                System.out.println("Cliente "+n+" "+p+" con cedula "+cel+" debe cancelar el valor de "+luz(valo, num));
                break;

            case 2:
                System.out.println("Ingresar el precio del inmueble");
                inm = tcl.nextDouble();
                System.out.println("$ (cursor)Ciente "+n+" "+p+" con cedula "+cel+" tiene un imueble de valor "+inm+" y tiene que pagar de pedrio $"+predio(inm));
                break;
            default:
                System.out.println("No poseemos esa opcion");
                ;
        }
    }

    public static double luz(double valo, double num) {
        return valo * num;
    }

    public static double predio(double inm) {
        return inm - (inm * 0.02);
    }
}

/* 
run:
Ingrese su nombre y apellido: juan pablo
Ingresar cedula: 
110927482
Desea
(1) pagar luz
(2) pagar predio
1
Dame le valor del kilowatio y el numero del kilowatio usado en el mes
12 393
Cliente juan pablo con cedula 110927482 debe cancelar el valor de 4716.0
BUILD SUCCESSFUL (total time: 13 seconds)
*/
/*
run:
Ingrese su nombre y apellido: juan pablo
Ingresar cedula: 
1102994829
Desea
(1) pagar luz
(2) pagar predio
2
Ingresar el precio del inmueble
12187214
$ (cursor)Ciente juan pablo con cedula 1102994829 tiene un imueble de valor 1.2187214E7 y tiene que pagar de pedrio $1.194346972E7
BUILD SUCCESSFUL (total time: 19 seconds)
*/
