package Aula07;

public class exercicio1 {
        public static void main(String[] args) {
            int[] numeros = {10, 20, 30, 40, 50};

            int soma = 0;
            for (int numero : numeros) {
                soma += numero;
            }

            System.out.println("=== Soma dos elementos ===");
            System.out.println("Soma total: " + soma);
        }
}

