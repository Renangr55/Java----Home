package Revendo;
import java.util.Scanner;
public class DesafioConversão {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o salário mínimo em String: ");
        String salarioMinimo = sc.nextLine().replace(",",".");;

        System.out.println("Digite seu salário autual em String: ");
        String salarioAtual = sc.nextLine().replace(",",".");

        System.out.println("Digite o salário mínimo em salarios dos Sonhos ");
        String salarioDosSonhos = sc.nextLine().replace(",",".");


        double salarioMinimoDouble = Double.parseDouble(salarioMinimo);
        double salarioAtualDouble = Double.parseDouble(salarioAtual);
        double salarioFuturo = Double.parseDouble(salarioDosSonhos);

        double mediaSalario = (salarioMinimoDouble + salarioAtualDouble + salarioFuturo) / 3;

        System.out.printf("A media dos salario: %.2f%n", mediaSalario);
        System.out.printf("Esse é o salário minimo: %f%n",salarioMinimoDouble);
        System.out.printf("Esse é o salário atual: %f%n",salarioAtualDouble);
        System.out.printf("Esse é o salário do salário do futuro: %f%n",salarioFuturo);

        sc.close();



    }
}
