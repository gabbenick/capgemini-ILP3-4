import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        new VariaveisTipoOperadores(scanner).variaveisTipoOperadores();
        new EstruturaCondicinalSe(scanner).estruturaCondicinalSe();
        new EstruturaEscolha(scanner).estruturaEscolha();
        new ExercicioQuinze(scanner).exercicioQuinze();
        new EstruturaWhile(scanner).estruturaWhile();
        new ExercicioEstruturaRepeticao(scanner).exercicioEstruturaRepeticao();
        new Exercicio22(scanner).exercicio22();

        scanner.close();
    }
}
