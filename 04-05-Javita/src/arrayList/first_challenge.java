package arrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class first_challenge {

    public static void main (String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Type the size of arrayList: ");
        int sizeList = read.nextInt();

        ArrayList<String> tasks = new ArrayList<String>(sizeList);

        System.out.println("Type the your choice [Yes/No]");
        String choice = read.nextLine();

        while (choice == choice.equalsIgnoreCase()){

            System.out.println("1 - Create task ");
            System.out.println("2 - remove task");
            System.out.println("3 - read task");
            System.out.println("4 - Leave");

            System.out.println("Type the operation: ");
            int operation = read.nextInt();


            switch (operation){

                case 1:
                    try {
                        System.out.println("Type the task name: ");
                        tasks.add(read.next());
                    } catch (InputMismatchException e){
                        throw new InputMismatchException("TypeError: type the correct type");
                    } finally {
                        System.out.println("Created?");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Type the task name to remove: ");
                        tasks.remove(read.nextLine());
                    } catch (InputMismatchException e){
                        System.out.println("TypeError: type the correct type, Please!!");
                    } finally {
                        System.out.println("Removed?");
                    }
                    break;
                case 3:
                    for (String task : tasks){
                        System.out.println(task);
                    }
                    break;
                case 4:
                    System.out.println("you leave");
                    options = false;
                    break;
                default:
                    System.out.println("Thanks for much");
            }

        }
    }
}
