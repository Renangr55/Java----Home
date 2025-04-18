package array;

import java.security.KeyStore;
import java.security.cert.TrustAnchor;

public class ex11 {
    public static void main(String[] args){
     char[] palavra = {'c','a','s','a'};
     char[] palavraInvertida = new char[palavra.length];
     int tamanhoInicio = palavra.length - 1;
     boolean palindromo = true;


     // invertendo
     for (int i = 0; i < palavra.length; i++){
         palavraInvertida[tamanhoInicio] = palavra[i];
         tamanhoInicio--;
     }

     //imprimindo a lista de caracters
    for (char a:palavraInvertida){
        System.out.println(a);
    }

     if (palavra.length != palavraInvertida.length){
         palindromo = true;
     } else {
         for (int j = 0; j < palavra.length; j++){
             if (palavra[j] != palavraInvertida[j]){
                 palindromo = false;
                 break;
             }
         }
     }


     if (palindromo){
         System.out.println("é um palindromo");
     } else {
         System.out.println("não é um palindromo");
     }

    }
}
