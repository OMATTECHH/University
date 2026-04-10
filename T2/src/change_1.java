import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_1 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        double distancia;
        double tempo;
        double velocidade;

        System.out.print("Distância (km): ");
        distancia = enter.nextDouble();

        System.out.print("Tempo (h): ");
        tempo = enter.nextDouble();

        velocidade = distancia / tempo;

        System.out.println("Velocidade média: " + velocidade + " km/h");
        enter.close();
    }
}
