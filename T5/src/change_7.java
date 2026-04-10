import java.util.Scanner;

public class change_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso = sc.nextDouble();
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade I");
        } else if (imc < 40) {
            System.out.println("Obesidade II");
        } else {
            System.out.println("Obesidade III");
        }
    }
}