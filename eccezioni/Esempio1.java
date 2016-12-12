package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */
public class Esempio1 {

    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("stop");
        }



    }


}
