package array;

public class ex2 {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        int contadorPar = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                contadorPar += array[i];

            }
        }

        System.out.println("a soma dos números Pares é: " + contadorPar);
    }
}
