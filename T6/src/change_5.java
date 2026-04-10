import java.util.Scanner;

public class change_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2026;
        int tentativas = 0;

        while (tentativas < 3) {
            int entrada = sc.nextInt();

            if (entrada == senha) {
                System.out.println("Acesso Permitido!");
                return;
            }

            tentativas++;
        }

        System.out.println("Terminal Bloqueado!");
    }
}