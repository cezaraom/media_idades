import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de idades: ");
        int n = sc.nextInt();
        double vect[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a " + (i + 1) + "ª idade: ");
            vect[i] = sc.nextDouble();
        }
        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma = soma + vect[i];
        }

        double media = soma / n;

        System.out.printf("A média das idades é %.2f", media);

    }
}