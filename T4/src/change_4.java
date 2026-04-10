import java.util.Scanner;

public class change_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, media;

        System.out.print("Nota 1: ");
        n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        n2 = sc.nextDouble();

        media = (n1 + n2) / 2;

        if (media >= 6.0) {
            System.out.println("Aprovado");
        }

        if (media < 6.0) {
            System.out.println("Exame");
        }
    }
}
