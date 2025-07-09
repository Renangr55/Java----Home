package arrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {


    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Type the size of arrayList: ");
        int sizeArray = read.nextInt();

        ArrayList<String> names = new ArrayList<String>(sizeArray);

        read.nextLine();

        for (int i = 0; i < sizeArray; i++){
            System.out.printf(" \n Type the students name: \n ");
            names.add(read.nextLine().toLowerCase());




        }

        try{
            System.out.println("type the name to remove: ");
            String nameDelete = read.nextLine();

            names.remove(nameDelete);
            System.out.println(" \n  removido \n");
        } catch (InputMismatchException e){
            System.out.println("\n The error to be in input user \n");
        }
        finally {
            System.out.printf("\n Entrou no finally \n");
        }

        for (String name: names){
            System.out.println(name);
        }

    }
}
