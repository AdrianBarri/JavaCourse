public class App3 {

    public static void main(String [] args) throws Exception {
        Potato miPotato = new Potato();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();

        System.out.println(miPotato.brazos);
        
    }

    
}

class Potato{
    public int brazos = 0;

    public void QuitarBrazo(){
        this.brazos--;
    }

}