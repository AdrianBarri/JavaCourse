public class OOP2 {

    public static void main(String [] args) throws Exception{
        Vehiculo cohete = new Vehiculo();
        Vehiculo moto = new Vehiculo();

        //Primera forma

        cohete.setTipo("Space X");
        cohete.setVelocidadMaxima(10000);
        cohete.setRapido(true);
        System.out.println(cohete.getTipo()+ " " + cohete.getVelocidadMaxima());
        System.out.println(cohete.isRapido());

        moto.setTipo("kawazaki");
        moto.setRapido(false);
        moto.setVelocidadMaxima(80);
        System.out.println(moto.getTipo()+ " " + moto.getVelocidadMaxima());
        System.out.println(moto.isRapido());



        //Segunda forma

       /* String tipo = cohete.getTipo();
        System.out.println(tipo);

        String tipoM = moto.getTipo();
        System.out.println(tipoM);*/


    }
    
}

class Vehiculo{
   private String tipo ;
   private int velocidadMaxima;
   private boolean rapido;

   public void setRapido(boolean rapido){
    this.rapido = rapido;

   }

   public boolean isRapido(){//solo se utiliza is con los valores booleanos en sus metodos
    
    return this.rapido;
   }


   public void setTipo(String valor){
    this.tipo = valor;
    
   }
   public String getTipo(){
    return this.tipo;
   }

   public void setVelocidadMaxima(int velocidadMaxima){
    this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }


}