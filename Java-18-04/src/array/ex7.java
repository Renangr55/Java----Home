package array;

public class ex7 {

    // exercicio: mulitplicando os valores de uma array
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4};
        int[] dobrado = new int[valores.length];



        for (int i = 0; i < valores.length; i++) {
            dobrado[i] = valores[i] * 2;

        }

        for (int i = 0; i < dobrado.length; i++){
            System.out.println(dobrado[i]);
        }
    }
}
