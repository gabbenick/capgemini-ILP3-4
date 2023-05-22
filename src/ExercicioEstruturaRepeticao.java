import java.util.Scanner;

public class ExercicioEstruturaRepeticao {
    private Scanner scanner;

    public ExercicioEstruturaRepeticao(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exercicioEstruturaRepeticao() {

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println("Digite um número");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("O número é 0");
            } else {
                if (numero > 0) {
                    System.out.println("O número é maior que 0");
                } else {
                    System.out.println("O número é menor que 0");
                }
            }
        }
        System.out.println("Deseja Continuar? S - Sim / N - Não");
        desejaContinuar = scanner.next().charAt(0);

    }
}
