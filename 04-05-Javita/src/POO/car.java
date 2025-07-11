package POO;

public class car {

    public static void main(String[] args){
        // instanciando um objeto da classe veiculo
        Vehicle jeep = new Vehicle();
        Vehicle toyota = new Vehicle();
        Vehicle fiat = new Vehicle();

        //carros.add(new String[]{"Fiat", "4", "vermelho", "esportivo"});

        jeep.brand = "Jeep";
        jeep.color = "Black";
        jeep.number_Wheels = 4;
        jeep.type = "Off-Road";


        toyota.brand = "toyota";
        toyota.color = "Black";
        toyota.number_Wheels = 4;
        toyota.type = "Urbano";

        fiat.brand = "Fiat";
        fiat.color = "Blue";
        fiat.number_Wheels = 4;
        fiat.type = "super";



        System.out.printf("Brand: %s | Color: %s | number: %d | type: %s\n", jeep.brand,jeep.color,jeep.number_Wheels,jeep.type);
        System.out.printf("Brand: %s | Color: %s | number: %d | type: %s\n", toyota.brand,toyota.color,toyota.number_Wheels,toyota.type);
        System.out.printf("Brand: %s | Color: %s | number: %d | type: %s\n", fiat.brand,fiat.color,fiat.number_Wheels,fiat.type);


    }
}
