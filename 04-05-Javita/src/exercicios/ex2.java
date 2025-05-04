package exercicios;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        System.out.print("quantidade de matrizes: "); // quantidade de matrizes
        int quantidadeElementos = scanner.nextInt();

        System.out.println("quantidade de elementos: "); // quantidade de elementos
        int quantidadeElementosSegundaArray = scanner.nextInt();

        int[][] elementosSoma = new int [quantidadeElementos][quantidadeElementosSegundaArray];

        for (int i = 0; i < elementosSoma.length; i++){
            for (int a = 0; a < elementosSoma[i].length; a++){
                System.out.println("Digite o elemento para primeira lista e segunda lista: ");
                elementosSoma[i][a] = scanner.nextInt();
                total += elementosSoma[i][a];
            }
        }

        System.out.println("a soma dos elementos da array é: " + total);


    }
}
