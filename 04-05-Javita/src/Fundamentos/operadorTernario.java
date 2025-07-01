package Fundamentos;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SplittableRandom;

public class operadorTernario {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ex1
        System.out.print("type a the number, please: ");
        int userNumber = sc.nextInt();

        sc.nextLine();

        String checking = userNumber % 2 == 0 ? "This number is Pairs" : "this number is Impar";
        System.out.println(checking);

        //ex2
        try {
            System.out.print("insert your the status ");
            boolean status = sc. nextBoolean();

            sc.nextLine();

            String Response = status == true  ? "approved" : "failed";
            System.out.println(Response);

        } catch (InputMismatchException e) {
            System.out.println("Erro : o tipo de dado que você digitou não é compatível " + e);
        }




        //ex3
        System.out.print("insert the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Insert the second number: ");
        int secondNumber = sc.nextInt();

        String verificando = firstNumber > secondNumber ? "First Number is bigger" : "Second number is bigger";
        System.out.println(verificando);

        // ex4
        System.out.println("Type a the Student grade ");
        Double studentName = sc.nextDouble();

        sc.nextLine();

        String checkingStudents = studentName > 5.0 ? "Approved" : "Failed";
        System.out.print(checkingStudents);

    }
}
