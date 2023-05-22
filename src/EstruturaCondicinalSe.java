import java.util.Scanner;

public class EstruturaCondicinalSe {
    private Scanner scanner;

    public EstruturaCondicinalSe(Scanner scanner) {
        this.scanner = scanner;
    }

    public void estruturaCondicinalSe() {
        int media = scanner.nextInt();

        if (media >= 7) {
            if (media == 10) {
                System.out.println("APROVADO COM NOTA MÁXIMA");
            } else {
                System.out.println("APROVADO");
            }
        } else {
            System.out.println("REPROVADO");
        }
    }

}
