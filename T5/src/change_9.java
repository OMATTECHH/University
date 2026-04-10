import java.util.Scanner;

public class change_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = sc.nextInt();
        double valor = sc.nextDouble();

        switch (op) {
            case 1:
                System.out.println((valor * 9/5) + 32);
                break;
            case 2:
                System.out.println((valor - 32) * 5/9);
                break;
            default:
                System.out.println("Inválido");
        }
    }
}