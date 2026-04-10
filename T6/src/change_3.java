import java.util.Scanner;

public class change_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int count = 0;

        double temp = sc.nextDouble();

        while (temp != 999) {
            soma += temp;
            count++;

            temp = sc.nextDouble();
        }

        if (count > 0) {
            System.out.println("Média: " + (soma / count));
        } else {
            System.out.println("Nenhum valor válido");
        }
    }
}