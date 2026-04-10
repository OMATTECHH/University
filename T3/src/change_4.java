import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_4 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double reais;
        double dolares;

        System.out.print("Valor em reais: ");
        reais = enter.nextDouble();

        dolares = reais / 5.0;

        System.out.println("Valor em dólares: US$ " + dolares);
        enter.close();
    }
}
