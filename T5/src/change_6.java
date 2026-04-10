import java.util.Scanner;

public class change_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 10) {
            System.out.println("Infantil");
        } else if (idade <= 17) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Sênior");
        }
    }
}