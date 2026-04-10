import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_6 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double r;
        double h;
        double volumeM3;
        double litros;

        System.out.print("Raio (m): ");
        r = enter.nextDouble();

        System.out.print("Altura (m): ");
        h = enter.nextDouble();

        volumeM3 = Math.PI * Math.pow(r, 2) * h;
        litros = volumeM3 * 1000;

        System.out.println("Volume em litros: " + litros);

        enter.close();
    }
}
