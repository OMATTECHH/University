import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_8 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double F;
        double C;

        System.out.print("Temperatura em Fahrenheit: ");
        F = enter.nextDouble();

        C = (F - 32) * 5 / 9;

        System.out.println("Temperatura em Celsius: " + C);
        enter.close();
    }
}
