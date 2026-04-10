import java.util.Scanner;

public class change_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n >= 0) {
            System.out.println("Sistema operando. T-menos " + n + " segundos;");
            n--;
        }
    }
}