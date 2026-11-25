package Aula07;
import java.util.Scanner;
public class exercicio6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] matriz = new int[2][2];

            System.out.println("=== Preenchendo a matriz 2x2 ===");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Valor da posição [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }

            System.out.println("\nMatriz digitada:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }

            sc.close();
        }
}

