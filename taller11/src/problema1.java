/*
Generar los procedimientos y/o funciones que impriman los valor pares, impares 
y el promedio de un arreglo bidimensional. El (los) procedimiento(s) o método(s)
deben ser invocados desde el método principal (quien es el único responsable de 
gestionar las entradas/salidas); además el método debe recibir como parámetro un 
arreglo bidimensional.

 */
import java.util.Scanner;

public class problema1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f, c;
        System.out.println("Dame el limite de las fila y culumnas: ");
        f = tcl.nextInt();
        c = tcl.nextInt();
        int[][] matriz = new int[f][c];
        genear(matriz);
        dar(matriz);
        darparimparmatriz(matriz);
        geprom(matriz);

    }

    public static void genear(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void dar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void darparimparmatriz(int matriz[][]) {
        System.out.println("Elementos pares de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2) == 0 ? matriz[i][j] + " " : "");
                /*if ((matriz[i][j] % 2) == 0) {
                    System.out.print(matriz[i][j] + " ");
                }*/

            }
            System.out.println("");
        }
        System.out.println("Elementos impares de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2) != 0 ? matriz[i][j] : " ");
                /*if ((matriz[i][j] % 2) == 0) {
                    System.out.print(matriz[i][j] + " ");
                }*/

            }
            System.out.println("");
        }
    }

    public static void geprom(int matriz[][]) {
        int sum = 0, prom = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                sum += matriz[i][j];
            }
        }
        prom = sum / (matriz.length * matriz[0].length);
        System.out.println("El promedio es: " + prom);
    }

}

/*
run:
Dame el limite de las fila y culumnas: 
5 7
8 0 2 6 3 0 5 
6 3 4 7 4 9 8 
6 6 3 1 4 1 2 
7 4 1 2 9 0 3 
2 6 6 8 9 8 3 
Elementos pares de la matriz
8 0 2 6 0 
6 4 4 8 
6 6 4 2 
4 2 0 
2 6 6 8 8 
Elementos impares de la matriz
    3 5
 3 7 9 
  31 1 
7 1 9 3
    9 3
El promedio es: 4
BUILD SUCCESSFUL (total time: 2 seconds)
*/