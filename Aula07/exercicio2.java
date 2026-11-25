package Aula07;
import java.util.Scanner;
public class exercicio2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] letras = {"A", "B", "C", "D", "E", "F"};

            System.out.print("Digite uma letra para buscar: ");
            String busca = sc.nextLine().trim();

            int posicao = -1; // -1 = não encontrada
            for (int i = 0; i < letras.length; i++) {
                if (letras[i].equalsIgnoreCase(busca)) {
                    posicao = i;
                    break;
                }
            }

            if (posicao >= 0) {
                System.out.println("A letra \"" + busca + "\" está no vetor, na posição " + posicao + ".");
            } else {
                System.out.println("A letra \"" + busca + "\" NÃO está no vetor.");
            }

            sc.close();
        }
}

