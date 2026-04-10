import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_6 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double a;
        double b;
        double c;

        System.out.print("Cateto A: ");
        a = enter.nextDouble();

        System.out.print("Cateto B: ");
        b = enter.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Hipotenusa: " + c);
        enter.close();
    }
}
