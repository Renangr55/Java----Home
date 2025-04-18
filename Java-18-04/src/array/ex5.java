package array;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número que você deseja: ");
        int userNumber = scanner.nextInt();

        boolean reposta = false;


        int [] numberArray = {1,2,3,4,5,6,7,8,9,10,11};

        for (int i = 0;i < numberArray.length; i++) {
            if (numberArray[i] == userNumber){
                reposta = true;

            }
        }

        System.out.println("o numero que vc digitou, tem na lista: " + reposta);
    }


}
