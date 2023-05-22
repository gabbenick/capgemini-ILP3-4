import java.util.Scanner;

public class ExercicioQuinze {
    private Scanner scanner;

    public ExercicioQuinze(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exercicioQuinze() {

        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 100) {
            System.out.println("Ele está no intervalo.");
        } else {
            System.out.println("Número não está no intervalo");
        }
    }
}
