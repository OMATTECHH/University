import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_6 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        int totalSegundos;
        int horas;
        int minutos;
        int segundos;

        System.out.print("Digite o tempo em segundos: ");
        totalSegundos = enter.nextInt();

        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = totalSegundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        enter.close();
    }
}
