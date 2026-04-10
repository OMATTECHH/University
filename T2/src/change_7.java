import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class change_7 {
    public static void main(String[] args){
        Scanner enter = new Scanner(in).useLocale(Locale.US);

        int codigo;

        System.out.print("Digite o código: ");
        codigo = enter.nextInt();

        if (codigo == 1234) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }
        enter.close();
    }
}
