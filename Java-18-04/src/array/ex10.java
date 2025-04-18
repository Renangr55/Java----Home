package array;

public class ex10 {
    public static void main (String[] args){
        int[] numbers = {1,2,3,4};
        int[] invertedNumbers = new int[numbers.length];
        int tamanhoVetorOriginalZeroBased = numbers.length - 1;


        for (int i = 0; i < numbers.length; i++){
            invertedNumbers[i] = numbers[tamanhoVetorOriginalZeroBased];
            tamanhoVetorOriginalZeroBased --;

        }

        for (int invertedNumber : invertedNumbers) {
            System.out.println(invertedNumber);
        }








    }
}
