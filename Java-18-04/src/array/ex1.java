package array;

public class ex1 {

    public static void main(String[] args){

        // aquecendo
        int[] numberArray = {1,2,3,4,5,6,8,9,10};


        for (int i = 0;i < numberArray.length; i++ ) {
            System.out.println(numberArray[i]);
        }

        // adição
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int soma = 0;
        for (int i = 0; i < numbers.length; i++) {
            soma += numbers[i];

        }

        System.out.println(soma);



    }

}
