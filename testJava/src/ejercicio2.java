public class ejercicio2 {
    public static void main(String[] args) throws Exception {
        coche miCoche = new coche();
        miCoche.addPuertas();
        System.out.println(miCoche.numPuertas);


    }
    
}

class coche{
    public int numPuertas = 0;
    public void addPuertas(){
        this.numPuertas++;
    }

}
