package ArrayMultidimensional;

import java.util.Scanner;

public class introducao {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int [][] teste = {{1,2,3,4,5},{6,7,8,9,10}};

        for (int i = 0; i < teste.length; i++){
            for (int j = 0; j < teste[i].length; j++){
                System.out.println(teste[i][j]);
            }
        }





    }

}
