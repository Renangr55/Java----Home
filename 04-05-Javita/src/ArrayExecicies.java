import java.util.Scanner;

public class ArrayExecicies {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int tamanhoLista = sc.nextInt();

        sc.nextLine();

        
        String[] listaNomes = new String[tamanhoLista];

        int [] quantidadeNome = new int[tamanhoLista];

        int contadorIguais = 0;
        int contadorNomesUnicos = 0;
        int idx = 0;



        try {
            for (int i = 0; i < listaNomes.length; i++ ){
                System.out.println(" Digite um nome: ");
                String nomes = sc.nextLine();
                listaNomes[i] = nomes;

                if (listaNomes[idx].equalsIgnoreCase(listaNomes[i])){
                    contadorIguais++;
                } else {
                    contadorNomesUnicos++;
                }
            }

            for (int i = 0; i < listaNomes.length; i++) {
                int contador = 0;
                for (int j = 0; j < listaNomes.length; j++) {
                    if (listaNomes[i].equalsIgnoreCase(listaNomes[j])) {
                        contador++;
                    }
                }
                quantidadeNome[i] = contador;

                boolean exibindo = true;

               

            }
        } finally {
            System.out.println("Contador de nomes iguais: " + contadorIguais);
            System.out.println("Contador de nomes Unicos: " + contadorNomesUnicos);
        }











    }
};
