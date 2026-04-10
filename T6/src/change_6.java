import java.util.Scanner;

public class change_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        int i = 0;

        while (i < 10) {
            double h = sc.nextDouble();

            soma += h;

            if (h > maior) maior = h;
            if (h < menor) menor = h;

            i++;
        }

        System.out.println("Média: " + (soma / 10));
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}