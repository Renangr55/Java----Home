package POO;

public class Personagem {

    String nome;
    int nivel;
    int forca;
    int velocidade;

    void exibirDetalhes (){
        System.out.printf("Nome: %s | Nivel: %s | Força: %d | Velocidade: %d \n", nome, nivel, forca, velocidade);
    }

    void atacar(String inimigo, int energia){
        if (energia > 20){
            System.out.format("Você pode atacar - Nome: %s | atacou: [ %s ]\n",nome, inimigo);
        } else {
            System.out.println("Sua energia é menor que 20, você não pode atacar ninguem");
        }

    };

}
