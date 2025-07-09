package exercicios;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        int tentativas;
        do {
            System.out.println("Digite sua senha");
            int senhaDigitada = sc.nextInt();

            int senhaCorreta = 1234;

            tentativas = 5;

            if (senhaDigitada == senhaCorreta) {
                System.out.println("A senha está correta");
                break;
            } else {
                System.out.println("a senha não está correta");
                tentativas--;
                continue;
            }
        } while (tentativas > 0);
    }
}
