package ArrayMultidimensional;

import java.util.Scanner;

public class pratcando {

 public static void main(String[] args){

     Scanner sc = new Scanner(System.in);


     int[][] arrayMultidimensionais = { {1,2,3},{4,5,6}};
     int soma = 0;

     for (int i = 0; i < arrayMultidimensionais.length; i++){
         for (int j = 0; j < arrayMultidimensionais[i].length; j++){

             System.out.println();

             soma += arrayMultidimensionais[i][j];
             System.out.println(arrayMultidimensionais[i][j] + "");

         }
     }

     System.out.println(soma);
 }
}
