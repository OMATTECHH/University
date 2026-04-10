import java.util.Scanner;

public class change_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();

        if (preco <= 50) {
            System.out.println("Barato");
        } else if (preco <= 100) {
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }
    }
}