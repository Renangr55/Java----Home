package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex4 {

    public static void main ( String[] args){

        Scanner read = new Scanner(System.in);

        System.out.println("Type the size of arraylist");
        int sizeList = read.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>(sizeList);

        int sizeListCopied = sizeList - 1 ;

        ArrayList<Integer> numbersCopied = new ArrayList<Integer>(sizeListCopied);

        for (int i = 0; i < sizeList; i++) {
            System.out.println("type the numbers: ");
            numbers.add(read.nextInt());
        }


        numbersCopied.addAll(numbers);
        for (int i = 0; i < numbersCopied.size();i++){
            int inverted = numbersCopied.size() - i;
            System.out.println("Invertido: " + inverted );
        }


        // Collections.reverse(numbers); // invertendo o arrayList Usando collections

        for (int number: numbers){
            System.out.println("Numbers: " + number);
        }

        for (int numberCop : numbersCopied){
            System.out.println("Numbers copied: " + numberCop);
        }

        read.close();




    }
}
