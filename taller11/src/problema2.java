
/*Generar una solución que implemente 3 procedimientos. Que permitan calcular 
el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada 
procedimiento/función debe recibir los datos necesarios y generar el valor 
correspondiente. Se debe invocar a los procedimientos desde un método principal;
Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama 
al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
El área del cuadrado es igual a lado x lado x lado x lado
El área del triángulo es igual a (base x altura)/2
El área del rectángulo es igual a base x altura
 * @author Andrés
 */
import java.util.Scanner;
public class problema2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String re;
        double b, h, ra;
        System.out.println("Dame la inicial de la area que deseas (t,r,c)");
        re=tcl.next();
        switch (re) {
            case "t":
                System.out.println("Dame la base y la altura: ");
                b=tcl.nextDouble();
                h=tcl.nextDouble();
                System.out.println("La area es: "+areatriangulo(b, h));
                break;
            case "r":
                System.out.println("Dame la base y altura");
                b=tcl.nextDouble();
                h=tcl.nextDouble();
                System.out.println("La area es: "+arearec(b, h));
                break;
            case "c":
                System.out.println("Dame el radio");
                ra=tcl.nextDouble();
                System.out.println("La area es: "+areacir(ra));
                break;
            default:
                System.out.println("no tenemos esa figura");
        }
    }
    public static double areatriangulo(double b, double h){
    return (b*h)/2;
    }
    public static double arearec(double b, double h){
    return (b*h);
    }
    public static double areacir(double r){
    return 3.14 *r*r;
    }
}
