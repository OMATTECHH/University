import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_5 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double r;
        double valorM2;
        double area;
        double custo;

        System.out.print("Raio da praça (m): ");
        r = enter.nextDouble();

        System.out.print("Valor por m²: ");
        valorM2 = enter.nextDouble();

        area = Math.PI * Math.pow(r, 2);
        custo = area * valorM2;

        System.out.println("Área total: " + area + " m²");
        System.out.println("Custo total: R$ " + custo);
        enter.close();
    }
}
