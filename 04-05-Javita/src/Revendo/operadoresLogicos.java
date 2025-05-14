package Revendo;

public class operadoresLogicos {
    public static void main (String[] args){

        boolean condicao = true;
        boolean codicaoTeste = 3 > 5;


        System.out.println(!condicao); // alterna o tipo do valor boleano
        System.out.println(condicao && codicaoTeste); // verificando se os dois são Verdadeiro
        System.out.println(condicao || codicaoTeste); // ele da true pq ele compara o primeiro e o segundo
        System.out.println(condicao ^ condicao);
    }
}
