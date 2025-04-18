package array;

public class ex9 {

    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        boolean teste = true;

        if (a.length != b.length){
            teste = true;
        } else {
            for (int i = 0; i < a.length;i++){
                if (a[i] != b[i]){
                    teste = false;
                    break;
                }
            }
        }

        if (teste) {
            System.out.println("as duas arrays são iguais");
        } else {
            System.out.println("As arrays são diferentes");
        }
    }
}
