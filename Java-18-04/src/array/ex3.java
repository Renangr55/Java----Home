package array;

public class ex3 {

    public static void main(String[] args) {
        int [] numbersArray = {1,10,90,79,46,1};

        int contador = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > 10){
                contador++;
            }
        }

        System.out.println("A quantidade de numeros que são maiores que 10: " + contador);
    }
}
