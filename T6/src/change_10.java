public class change_10 {
    public static void main(String[] args) {

        double valor = 500000;
        double manutencao = 15000;
        double acumulado = 0;

        int anos = 0;

        while (acumulado <= valor) {
            anos++;

            acumulado += manutencao;
            valor *= 0.88;
            manutencao += 5000;
        }

        System.out.println("Anos: " + anos);
    }
}