import java.util.Scanner;

public class change_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Lado A: ");
        a = sc.nextDouble();

        System.out.print("Lado B: ");
        b = sc.nextDouble();

        System.out.print("Lado C: ");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Forma um triângulo");
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}
