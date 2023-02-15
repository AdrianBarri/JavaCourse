public class App2 {
    public static void main(String[] args) throws Exception {        

        int suma1 = 0;
        int resta1 = 0;
        int multiplicacion1 = 0;
        double division1;
        int producto1 = 0;
        suma1 = suma( 5 , 7);
        resta1 = resta( 5 , 7);
        multiplicacion1 = multiplicacion( 5 , 7);
        division1 = division( 35 , 5);
        producto1 = producto( 5 , 7);
        System.out.println(suma1);
        System.out.println(resta1);
        System.out.println(multiplicacion1);
        System.out.println(division1);
        System.out.println(producto1);

    }

    public static  int suma(int a, int b) {
        return a + b;
        
    }

    public static  int resta(int a, int b) {
        return a - b;
        
    }


    public static  int multiplicacion(int a, int b) {
        return a * b;
        
    }

    public static  double division(int a, int b) {
        return a / b;
        
    }

    public static  int producto(int a, int b) {
        return a % b;
        
    }



}
