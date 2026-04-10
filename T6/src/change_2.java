import java.util.Scanner;

public class change_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int menor = Math.min(a, b);
        int maior = Math.max(a, b);

        int i = menor + 1;

        while (i < maior) {
            System.out.println(i);
            i++;
        }
    }
}