package array;

public class ex8 {

    public static void main(String[] args){
        int[] numbers = {1,-1,-2,8,5,6,-9};
        int[] PositiveNumbers = new int[4];

        int positive = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                PositiveNumbers[positive] = numbers[i];
                positive++;
            }
        }

        for (int o = 0; o < PositiveNumbers.length;o++){
            System.out.println(PositiveNumbers[o]);
        }

    }
}
