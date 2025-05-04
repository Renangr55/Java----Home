package exercicios;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;

        System.out.println("Insira a quantidade de alunos");
        int quantidadeAlunos = scanner.nextInt();

        System.out.println("insira a quantidade de notas");
        int quantidadeNotas = scanner.nextInt();

        double [][] alunos = new double[quantidadeAlunos][quantidadeNotas];

        for (int i = 0;i <= alunos.length; i++){
            for (int n = 0; n <= alunos[i].length; n++){
                System.out.printf("informe a nota %d e o aluno %d: ", n + 1,i + 1);
                alunos[i][n] = scanner.nextDouble();
                total += alunos[i][n];

            }

        }

        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.printf("a média é %f: ",media);
    }

}
