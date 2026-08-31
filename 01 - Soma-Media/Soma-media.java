import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            soma += numero;
        }

        double media = (double) soma / 3;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}
