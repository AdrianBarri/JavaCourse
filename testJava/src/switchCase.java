public class switchCase {
    public static void main(String [] args ) throws Exception{

        var estacion = "Verano";

        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es verano");
                break;        
            default:
                System.out.println("Es otra estacion");
                break;
        }

    }
    
}
