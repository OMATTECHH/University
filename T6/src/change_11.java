import java.util.Scanner;

public class change_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Não é primo");
            return;
        }

        int i = 2;
        boolean primo = true;

        while (i * i <= n) {
            if (n % i == 0) {
                primo = false;
                break;
            }
            i++;
        }

        System.out.println(primo ? "Primo" : "Não é primo");
    }
}