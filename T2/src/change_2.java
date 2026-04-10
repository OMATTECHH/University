import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_2 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double reais;
        double cotacao;
        double dolares;

        System.out.print("Valor em reais (R$): ");
        reais = enter.nextDouble();

        System.out.print("Cotação do dólar: ");
        cotacao = enter.nextDouble();

        dolares = reais / cotacao;

        System.out.println("Valor em dólares: US$ " + dolares);
        enter.close();
    }
}
