import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_2 {
    static void main(String[] args) {
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double lado;
        double area;

        System.out.print("Digite o lado do quadrado: ");
        lado = enter.nextDouble();

        area = lado * lado;

        System.out.println("Área: " + area);
        enter.close();
    }
}
