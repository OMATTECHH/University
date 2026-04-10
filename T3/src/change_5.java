import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_5 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double peso;
        double altura;
        double imc;

        System.out.print("Peso (kg): ");
        peso = enter.nextDouble();

        System.out.print("Altura (m): ");
        altura = enter.nextDouble();

        imc = peso / Math.pow(altura, 2);

        System.out.println("IMC: " + imc);
        enter.close();
    }
}
