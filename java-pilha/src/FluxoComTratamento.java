
public class FluxoComTratamento {
	public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
        	metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception - " + msg);
        	ex.printStackTrace();
        } 
//        catch (NullPointerException ex) {
//        	String msg = ex.getMessage();
//        	System.out.println("NullPointerException - " + msg);
//        	ex.printStackTrace();
//        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
//        try {
//        	metodo2();
//        } catch (ArithmeticException ex) {
//        	System.out.println("ArithmeticException");
//        }
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//            Conta c = null;
//            c.deposita();
            int a = i / 0;
//            try {
//            	int a = i / 0;
//            } catch(ArithmeticException ex) {
//            	System.out.println("ArithmeticException");
//            }
            
        }
        System.out.println("Fim do metodo2");
    }
}
