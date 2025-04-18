package array;

public class ex6 {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] even = new int[10];
        int[] odd = new int[10];


        int evenIndex = 0;
        int oddIndex = 0;


        for (int i = 0; i < numberArray.length; i++) {

            //PARES
            if (numberArray[i] % 2 == 0) {
                even[evenIndex] = numberArray[i];
                evenIndex++;

            } else { // IMPARES
                odd[oddIndex] = numberArray[i];
                oddIndex++;
            }

        }

        for (int i = 0; i < even[i]; i++){
            System.out.println("pares: " + even[i]);
        }

        for (int i = 0; i < odd[i]; i++){
            System.out.println("impares: " + odd[i]);
        }


    }

}
