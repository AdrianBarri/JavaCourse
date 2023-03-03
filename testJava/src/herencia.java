public class herencia{

    public static void main(String [] args){
     /*    Cliente cliente = new Cliente();
        cliente.nombre="Aron Valdez";
        cliente.edad=28;
        cliente.telefono="66214535";
        cliente.credito = "$500000.00";
        System.out.println("el cliente de nombre:" + cliente.nombre + " tiene " + cliente.edad +" años de edad y su numero telefonico es " + cliente.telefono + " cuenta con un credito de " +cliente.credito  );
        cliente.setNombre("Juancarlo exposito");
        System.out.println(cliente.getNombre());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("JuanPablo Cazas");
        System.out.println(trabajador.getNombre());
        trabajador.nombre="Javier Arce";
        trabajador.edad=32;
        trabajador.telefono="665422338";
        trabajador.salario=25000;
        System.out.println("el Trabajador de nombre:" + trabajador.nombre + " tiene " + trabajador.edad +" años de edad y su numero telefonico es " + trabajador.telefono + " y su salario es de $" +trabajador.salario  );

*/

Trabajador trabajador = new Trabajador();
trabajador.saludo();
trabajador.suma((float)2, (float)2);

    }

}
 /* 
abstract class Persona{
    int edad;
    String nombre;
    String telefono;

    public Persona(){
        System.out.println("estoy en el constructor persona");
    }

    abstract public String getNombre();

    abstract public void setNombre(String nombre);

}

class Cliente extends Persona{
    String credito;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}

class Trabajador extends Persona{

    double salario;

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}

*/
/* 

class Persona{
    String nombre;

    public void saludo(){
        System.out.println("saludo");

    }

    public int suma(int a, int b){
        System.out.println("se ejecutan los int");
        return a + b ;

    }

    public float suma(float a, float b){
        System.out.println("se ejecutan los float");
        return a + b * (float)9.5;
    }

    public void  suma(double a, double b){
        System.out.println("se ejecutan los double");

        System.out.println("el resultado es " + (a + b));
    }

}

class Trabajador extends Persona{


    public void saludo(){
        System.out.println("Hey you");

    }

}

*/


interface Persona{
    int variables = 0;
    void Correr(int velocidad);
    void Parar(int velocidad);
}

class Atleta implements Persona{

    public void Correr(int velocidad){


    }

    public void Parar(int velocidad){

    }

}