import java.util.Scanner;

public class change_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nascimento, atual, idade;

        System.out.print("Ano de nascimento: ");
        nascimento = sc.nextInt();

        System.out.print("Ano atual: ");
        atual = sc.nextInt();

        idade = atual - nascimento;

        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }

        if (idade >= 18) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }
    }
}
