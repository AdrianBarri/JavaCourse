public class OOP {
    public static void main (String [] args) throws Exception{
        Carro carro = new Carro();
        System.out.printf("Puertas: %d\n", carro.numPuertas);
        System.out.println(carro.velocidadMaxima);
        System.out.println(carro.velocidadNormal);

        Carro carro2 = new Carro(2,90);
        System.out.printf("Puertas: %d\n", carro2.numPuertas);
        System.out.println(carro2.velocidadMaxima);
        System.out.println(carro2.velocidadNormal);

    }
    
}

class Carro{

    int numPuertas;
    int velocidadMaxima;
    float velocidadNormal;

    public Carro(){
        System.out.println("marca");
        numPuertas = 5;
        velocidadMaxima = 120;
        System.out.println("consructor con parametros");
    }

    public Carro(int puertas, int velocidad){
        numPuertas = puertas;
        velocidadMaxima = velocidad;

        System.out.println("consructor con sin parametros");

    }

    public void acelerar(){

        velocidadNormal += 15;

    }

    public void deselerar(){

    }



}