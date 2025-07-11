package POO;

public class Heroi {
    public static void main(String[] args){
        Personagem heroi = new Personagem();
        Personagem vilao = new Personagem();

        heroi.nome = "Homem de ferro";
        heroi.nivel = 50;
        heroi.forca = 30;
        heroi.velocidade = 30;

        vilao.nome = "Thanos";
        vilao.nivel = 40;
        vilao.forca = 30;
        vilao.velocidade = 30;

        heroi.exibirDetalhes();
        heroi.atacar("Ultron",20);
        vilao.exibirDetalhes();
    }
}
