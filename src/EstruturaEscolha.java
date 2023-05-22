import java.util.Scanner;

public class EstruturaEscolha {
    private Scanner scanner;

    public EstruturaEscolha(Scanner scanner) {
        this.scanner = scanner;
    }

    public void estruturaEscolha() {
        int codigoProduto = scanner.nextInt();

        switch (codigoProduto) {
            case 1:
                System.out.println("Salgado.");
                break;
            case 2:
                System.out.println("Refrigerante.");
                break;
            default:
                System.out.println("Nenhum produto selecionado.");
        }
    }
}
