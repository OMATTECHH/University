import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.in;
import static java.util.Locale.US;

public class change_2 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(in).useLocale(US);

       double r, i, v;

       IO.println("Resitencia:");
       r = enter.nextDouble();

       IO.println("Corrente:");
       i = enter.nextDouble();

       v = r * i;
       IO.println("Voltagem; " +  v + "V");

        enter.close();
    }
}
