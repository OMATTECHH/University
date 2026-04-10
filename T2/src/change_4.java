import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double potencia;
        double horas;
        double preco;
        double consumo;
        double custo;

        System.out.print("Potência (W): ");
        potencia = enter.nextDouble();

        System.out.print("Horas por dia: ");
        horas = enter.nextDouble();

        System.out.print("Preço do kWh: ");
        preco = enter.nextDouble();

        consumo = (potencia / 1000) * horas * 30;
        custo = consumo * preco;

        System.out.printf("Custo mensal: R$ %.2f%n", custo);
    }
}
