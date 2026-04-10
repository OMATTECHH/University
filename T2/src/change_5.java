import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_5 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double km;
        double litros;
        double consumo;

        System.out.print("Distância (km): ");
        km = enter.nextDouble();

        System.out.print("Combustível (litros): ");
        litros = enter.nextDouble();

        consumo = km / litros;

        System.out.println("Consumo médio: " + consumo + " km/l");
        enter.close();
    }
}
