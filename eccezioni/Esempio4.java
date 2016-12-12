package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */
public class Esempio4 {//Finally

    public static void main(String[] args) {
        test();


    }

    private static void test() {

        try {
            System.out.println("blocco try esterno");
            try{
                System.out.println("blocco try interno");
                throw new Exception("Ciao eccezione interna");
            }catch (ArithmeticException e){
                System.out.println("dentri Catch interno");
            } finally {
                System.out.println("dentro Finally interno");
            }

        }catch (Exception e) {
            System.out.println("blocco catch esterno");
        } finally {
            System.out.println("blocco FINALLY esterno");
        }
    }
}
