public class herencia{

    public static void main(String [] args){
        Cliente cliente = new Cliente();
        cliente.nombre="Aron Valdez";
        cliente.edad=28;
        cliente.telefono="66214535";
        cliente.credito = "$500000.00";
        System.out.println("el cliente de nombre:" + cliente.nombre + " tiene " + cliente.edad +" años de edad y su numero telefonico es " + cliente.telefono + " cuenta con un credito de " +cliente.credito  );

        Trabajador trabajador = new Trabajador();
        trabajador.nombre="Javier Arce";
        trabajador.edad=32;
        trabajador.telefono="665422338";
        trabajador.salario=25000;
        System.out.println("el Trabajador de nombre:" + trabajador.nombre + " tiene " + trabajador.edad +" años de edad y su numero telefonico es " + trabajador.telefono + " y su salario es de $" +trabajador.salario  );


    }

}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    String credito;
}

class Trabajador extends Cliente{
    double salario;
}