import java.util.Scanner;

public class Exercicio22 {
    private Scanner scanner;

    public Exercicio22(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exercicio22() {

        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        int i;

        for (i = 0; i < 2; i++) {

            System.out.println("Digite o nome do produto.");
            nomeProduto = scanner.nextLine();

            System.out.println("Digite o preço de custo.");
            precoCusto = scanner.nextFloat();

            System.out.println("Digite o preço de venda.");
            precoVenda = scanner.nextFloat();

            scanner.nextLine();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preço de venda = " + precoVenda);

            if (precoCusto == precoVenda) {
                System.out.println("Não houve lucro.");
            } else if (precoCusto > precoVenda) {
                System.out.println("Houve prejuízo.");
            } else {
                System.out.println("Houve lucro.");
            }

        }
        System.out.println("A média do preço de custo é de: " + (totalCusto / i));
        System.out.println("A média do preço de venda é de: " + (totalVenda / i));
        System.out.println("O lucro total é: " + ((totalVenda / i) - (totalCusto / i)));
    }

}
