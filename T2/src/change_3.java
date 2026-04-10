import java.util.Scanner;
import static java.util.Locale.US;
import static java.lang.System.in;

public class change_3 {
   public static void main(String[] args){
       Scanner enter = new Scanner(in).useLocale(US);

       int atual;
       int minimo;

       IO.println("Quantidade atual:");
       atual = enter.nextInt();

       IO.println("Quantidade minima:");
       minimo = enter.nextInt();

       if (atual < minimo){
           IO.println("Efetuar Compra");
       }else{
           IO.println("Estoque Ok");
       }

       enter.close();
   }
}
