package Aula07;
import java.util.Scanner;
public class exercicio3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            boolean[] valores = new boolean[8];
            int totalTrue = 0;

            System.out.println("=== Contagem de valores true ===");
            for (int i = 0; i < valores.length; i++) {
                System.out.print("Valor " + (i + 1) + " (true ou false): ");
                valores[i] = sc.nextBoolean();
                if (valores[i]) {
                    totalTrue++;
                }
            }

            System.out.println("Quantidade de valores true: " + totalTrue);

            sc.close();
        }
}

