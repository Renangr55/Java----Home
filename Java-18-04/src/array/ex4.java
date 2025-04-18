package array;

public class ex4 {

    public static void main(String[] args) {

         int [] notas = {7,6,8,10,9};

         int media = 0;

         for (int i = 0; i < notas.length; i++) {
             media += notas[i];


         }

        double teste = (double) media / 5;
        System.out.println(teste);
    }
}
