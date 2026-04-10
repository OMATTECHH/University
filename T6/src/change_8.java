import java.util.Scanner;

public class change_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inicio = sc.nextDouble();
        double fim = sc.nextDouble();
        double passo = sc.nextDouble();

        double atual = inicio;

        while (atual <= fim) {
            double c = atual - 273.15;
            System.out.println(atual + "K = " + c + "C");
            atual += passo;
        }
    }
}