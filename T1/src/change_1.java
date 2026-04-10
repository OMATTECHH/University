import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double volume;
        double consumption;
        double total;
        double bags;

        IO.println("Informe o número total de concreto (m3):");
        volume = enter.nextDouble();

        IO.println("Informe o consumo de cimento (kg/m3):");
        consumption = enter.nextDouble();

        total = volume + consumption;
        bags = total / 50;

        IO.println("A quantiade de sacos de cimento serão: " + bags);
        enter.close();
    }
}
