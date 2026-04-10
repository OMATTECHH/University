import java.util.Scanner;

public class change_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        System.out.println("100: " + valor / 100);
        valor %= 100;

        System.out.println("50: " + valor / 50);
        valor %= 50;

        System.out.println("20: " + valor / 20);
        valor %= 20;

        System.out.println("10: " + valor / 10);
        valor %= 10;

        System.out.println("5: " + valor / 5);
        valor %= 5;

        System.out.println("2: " + valor / 2);
        valor %= 2;

        System.out.println("1: " + valor);
    }
}