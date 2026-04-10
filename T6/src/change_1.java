import java.util.Scanner;

public class change_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            int resultado = n * i;

            if (resultado % 3 == 0) {
                System.out.println(n + " x " + i + " = " + resultado);
            }

            i++;
        }
    }
}