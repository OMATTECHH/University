import java.util.Scanner;

public class change_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();

        if (ano >= 1901 && ano <= 2000) {
            System.out.println("Século XX");
        } else if (ano >= 2001 && ano <= 2100) {
            System.out.println("Século XXI");
        } else {
            System.out.println("Outro");
        }
    }
}