package arrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mercadinho {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to mercadinho");

        ArrayList<String> items = new ArrayList<>();


        int alternative = 1;
        while (alternative == 1){

            System.out.println("1 - create product");
            System.out.println("2 - remove product");
            System.out.println("3 - view to cart");

            System.out.println("Choice the operation: ");
            int operation = read.nextInt();

            read.nextLine();

            // add item
            if (operation == 1){
                try {
                    System.out.println("type the product name: ");
                    items.add(read.nextLine());
                } catch (InputMismatchException e){
                    throw new InputMismatchException("TypeError: Type the correct type to input");
                } finally {
                    System.out.println("Operation conclused");
                }
            }

            // remove item
            if (operation == 2){
                try{
                    System.out.println("Type the product name to remove: ");
                    items.remove(read.nextLine());
                } catch (InputMismatchException e){
                    throw new InputMismatchException("TypeError: Type the correct type to input");
                } finally {
                    System.out.println("Operation conclused");
                }
            }
            // read item
            if (operation ==  3){

                System.out.println("reading all items");
                for (String item: items){
                    System.out.println("Item: " + item);
                }

            }


            System.out.println("choice the alternative - [1 continue] - [2 - stop]: ");
            int options = read.nextInt();

            if (options == 2){
                alternative = 2;
                if (alternative == 2){
                    System.out.println("you leave.....");
                }
            }


        }
    }
}
