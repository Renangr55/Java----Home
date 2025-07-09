import java.util.Scanner;

public class ex1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();


        System.out.println("Digite a quantidade de coluna: ");
        int colunas = sc.nextInt();

        double[][] notasAlunos = new double[linhas][colunas];

         for (int i = 0; i < linhas; i++){
             for (int j = 0; j < colunas; j++){
                 System.out.println("Digite as notas na matriz");
                 System.out.print("Elemento [" + i + "][" + j + "]: ");
                 notasAlunos[i][j] = sc.nextInt();


             }
         }

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){

                double media = notasAlunos[i][j] / 3;

                if (media >= 7.0){
                    System.out.println("O aluno: " + i + " foi aprovado" );
                } else if (notasAlunos[i][j] < 7.0){
                    System.out.println("O aluno: " + i + " não foi aprovado");
                }
            }
        }

         for (int i = 0; i < linhas; i++){
             for (int j = 0; j < colunas; j++){
                 System.out.println(notasAlunos[i][j]);

             }
         }
    }
}
