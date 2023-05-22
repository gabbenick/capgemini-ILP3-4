import java.util.Scanner;

public class EstruturaWhile {
    private Scanner scanner;

    public EstruturaWhile(Scanner scanner) {
        this.scanner = scanner;
    }

    public void estruturaWhile() {

        int totalAlunos = 10;

        while (totalAlunos > 0) {
            String nomeAluno = scanner.nextLine();
            int idadeAluno = scanner.nextInt();

            System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }

    }
}
