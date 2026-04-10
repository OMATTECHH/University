import java.util.Scanner;

public class change_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("É múltiplo de 3 e 5");
        } else {
            System.out.println("Não é múltiplo de 3 e 5");
        }
    }
}
