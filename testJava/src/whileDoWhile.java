public class whileDoWhile {

    public static void main(String [] args) throws Exception{

        int contador = 10;
/* 
        while (contador > 0 ) {
            System.out.println("contador es igual a " + contador);
             contador -= 1 ;
        }
*/
        do{
            System.out.println("contador es igual a " + contador);
            contador -= 1 ;

        } while (contador > 0);
    }
    
}
