package POO;

public class Animals {
    public static void main(String[] args){
        Animal cachorro = new Animal();

         cachorro.especie = "Salsicha";
         cachorro.genero = "Masculino";
         cachorro.altura = 0.70F;
         cachorro.cor = "Marrom";
         cachorro.habitat = "Casa";

        System.out.format("Especie: %s \n Genero: %s \n Altura: %.2f Cor: %s \n, Habitat: %s \n", cachorro.especie, cachorro.genero,cachorro.altura,cachorro.cor, cachorro.habitat);
    }
}
