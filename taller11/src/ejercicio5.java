
/*Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
* @author Andrés
 */
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f = 5, c = 5, f2 = 5, c2 = 5;

        int matriz[][] = new int[f][c];
        int matriz2[][] = new int[f][c];
        matriz(matriz, matriz2);
        suma(matriz, matriz2, f, c, f2, c2);
        resta(matriz, matriz2, f, c, f2, c2);
        multi(matriz, matriz2, f, c, f2, c2);

    }

    public static void matriz(int matriz[][], int matriz2[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Matriz 1");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void suma(int matriz[][], int matriz2[][], int f, int c, int f2, int c2) {
        if ((f == f2) && (c == c2)) {
            int sum[][] = new int[f][c];
            System.out.println("La suma de las matrices");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    sum[i][j] = matriz2[i][j] + matriz[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("No se puede sumar");
        }
    }

    public static void resta(int matriz[][], int matriz2[][], int f, int c, int f2, int c2) {
        if ((f == f2) && (c == c2)) {

            int res[][] = new int[f][c];
            System.out.println("La resta de las matrices");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    res[i][j] = matriz2[i][j] - matriz[i][j];
                    System.out.print(res[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("No se puede restar");
        }
    }

    public static void multi(int matriz[][], int matriz2[][], int f, int c, int f2, int c2) {
        if (c == f2) {
            int multi[][] = new int[f][c2];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < matriz[0].length; k++) {
                        multi[i][j] += matriz[i][k] * matriz[k][j];
                    }

                }
            }
            for (int i = 0; i < multi.length; i++) {
                for (int j = 0; j < multi[0].length; j++) {
                    System.out.print(multi[i][j] + " ");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("No se puede multiplicar");
        }
    }
}
/*
run:
Ingresar limite de  las matricez: 3 3 3 3
Matriz 1
96 92 91  
74 92 85  
45 50 47  
Matriz 2
22 48 12  
26 20 31  
27 52 23  
La suma de las matrices
118 140 103 
100 112 116 
72 102 70 
La resta de las matrices
-74 -44 -79 
-48 -72 -54 
-18 2 -24 
20119 21846 20833  
17737 19522 18549  
10135 11090 10554  
BUILD SUCCESSFUL (total time: 4 seconds)
*/
