package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.printf("Seja vem vibndo ao cadastro de nomes \n");

        System.out.println("Type the size of Arralist, Please!!! : ");
        int sizeArray = ler.nextInt();

        ler.nextLine();

        ArrayList<String> carros = new ArrayList<String>(sizeArray);

        for (int t = 0; t < sizeArray; t++){
            System.out.println("Type the Students name ");
            carros.add(ler.nextLine()); // adicionando os nomes direto na array

        }
        for (String i: carros){
            System.out.println(i);
        }

        ler.close();
    }
}
