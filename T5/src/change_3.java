import java.util.Scanner;

public class change_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letra = sc.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }
    }
}