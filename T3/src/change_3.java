import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_3 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double n1;
        double n2;
        double n3;
        double media;

        System.out.print("Nota 1: ");
        n1 = enter.nextDouble();

        System.out.print("Nota 2: ");
        n2 = enter.nextDouble();

        System.out.print("Nota 3: ");
        n3 = enter.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.printf("Média: %.2f%n", media);
        enter.close();
    }
}
