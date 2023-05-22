import java.util.Scanner;

public class VariaveisTipoOperadores {

    private Scanner scanner;

    public VariaveisTipoOperadores(Scanner scanner) {
        this.scanner = scanner;
    }

    public void variaveisTipoOperadores() {
        int idade = 0;
        float cotacaoDolar = 5.0f;
        double cotacaoEuro = 5.0d;
        char genero = 'M';
        byte ponto = 0;
        boolean estaCadastrado = false;

        String nome = "Esse é um texto de uma variável String";

        System.out.println(idade + "\n" + cotacaoDolar);

    }

}
