public class debug {
    public static void main(String [] args){
        funcion1();
    }

    public static void funcion1() {
        funcion2();
    }

    public static void funcion2() {
        funcion3();
    }

    public static void funcion3() {
        funcion4();
    }

    public static void funcion4() {
        funcion5();
    }

    public static void funcion5() {
        System.out.println("Holaaaaa");
       // var i = 15;

        System.out.println(15/0);
    }
    
}
