import java.util.Scanner;

public class change_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b = sc.nextDouble();
        double n = sc.nextDouble();

        int count = 0;

        while (n > 1) {
            n /= b;
            count++;
        }

        System.out.println("Resultado: " + count);
    }
}