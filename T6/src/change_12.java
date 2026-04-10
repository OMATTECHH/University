import java.util.Scanner;

public class change_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int termos = sc.nextInt();

        double pi = 0;
        int i = 0;

        while (i < termos) {
            double termo = 1.0 / (2 * i + 1);

            if (i % 2 == 0) {
                pi += termo;
            } else {
                pi -= termo;
            }

            i++;
        }

        pi *= 4;

        System.out.println("Aproximado: " + pi);
        System.out.println("Math.PI: " + Math.PI);
    }
}