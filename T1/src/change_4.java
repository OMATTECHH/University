import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_4 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double c;
        double i;
        double t;
        double m;

        System.out.print("Capital: ");
        c = enter.nextDouble();

        System.out.print("Taxa: ");
        i = enter.nextDouble();

        System.out.print("Tempo (meses): ");
        t = enter.nextDouble();

        m = c + (c * i * t);

        System.out.println("Montante: " + m);
        enter.close();
    }
}
