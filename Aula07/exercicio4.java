package Aula07;
import java.util.Scanner;
public class exercicio4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] nomes = {"Ana", "Bruno", "Clara"};

            System.out.print("Digite o nome que deseja verificar: ");
            String busca = sc.nextLine().trim();

            boolean encontrado = false;
            for (String nome : nomes) {
                if (nome.equalsIgnoreCase(busca)) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("O nome \"" + busca + "\" está no vetor.");
            } else {
                System.out.println("O nome \"" + busca + "\" NÃO está no vetor.");
            }

            sc.close();
        }
}

