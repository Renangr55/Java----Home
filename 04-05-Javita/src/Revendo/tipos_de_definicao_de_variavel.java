package Revendo;

import java.util.Date;

public class tipos_de_definicao_de_variavel {
    public static void main(String[] args) {
        final int num = 30;
        System.out.printf("essa variavel é uma constnte %d%n",num);
        // var
        var letra = "a";
        System.out.println("essa váriavel é do tipo var,ela permite eu definir um valor sem precisar especificar o tipo"+ letra);

        // literal
        long a = 3_134_845_223L;
        System.out.println("literal" + a);

        float slario = 11_445.44F;
        System.out.println("Literal" + slario);
        // Date
        Date teste = new Date();
        System.out.println(teste);

        //definição de variavel com o caminho completo
        java.lang.String palavra = "alalka"; // podemos definir uma str assim tambem, ela é o caminho

        String saudacao = "Olá Renan";
        System.out.println(saudacao.indexOf("a")); // printa o indice do elemento
        System.out.println(saudacao.charAt(1)); // prntando o elemento que está no 1 indice
        System.out.println(saudacao.concat("Gabriel")); // adicionando gabriel na string
        System.out.println(saudacao.replace("Olá","parceiro")); // mudando o Olá porparceiro
        System.out.println(saudacao.substring(1,5)); // printando range de 1 indice até o 5
        System.out.println(saudacao.compareTo("gabriel"));
        System.out.println(saudacao.strip());

        // wrappers
        boolean testando = Boolean.parseBoolean("true");
        System.out.println(testando);

        double primeiroTeste = 20.00; // conversão implícita
        float kaka = (float) 1.12345; // conversão explícita(CAST)

        double cast = 1;
        int castAtt = (int) cast;
        System.out.println(castAtt);// cast

        int castInt = 100000;
        long atualizando = (long) castInt;
        System.out.println(atualizando);

        // cast int para string
        int castIntStr = 1000;
        String att = Integer.toString(castIntStr);
        System.out.println(att instanceof String);// ele verificou se era string

        //cast string para double
        String ls = "10000";
        double lsAtt = Double.parseDouble(ls); // string convertido para double
        System.out.println(lsAtt);

        // wrappers rimitivos (como int, double, boolean) e os tornam objetos.
        // Cada tipo primitivo possui uma classe wrapper correspondente,
        // como Integer para int, Double para double e Boolean para boolean.
        // Isso permite que os desenvolvedores usem objetos
        // em vez de primitivos em situações onde objetos são necessários, como em coleções.
        int lsInt = Integer.parseInt(ls);
        System.out.println(ls);


        String minhaData = "05052007";
        System.out.println(minhaData.replace(".","/"));


        int minhaDataInt = Integer.parseInt(minhaData);
        System.out.printf("essa é minha data de nascimento: %d", minhaDataInt);

        double minhaDataDouble = Double.parseDouble(minhaData);
        System.out.printf("essa é minha data em double kkk %2f", minhaDataDouble);

        System.out.println("\n");
        final String segundoNumero = "02";

        
        int testandoL = Integer.parseInt(segundoNumero);
        System.out.println(testandoL);






    }
}
