import java.util.Scanner;

public class change_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Categoria Adulta");
        }
    }
}
