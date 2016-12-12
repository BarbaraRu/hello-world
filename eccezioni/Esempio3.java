package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */
public class Esempio3 { //metodo lancia eccezione

    public static void main(String[] args) {

        try {
            double risultato= dividi(10,0);
        } catch (Exception e) {
            System.out.println("non posso eseguire");
           // e.printStackTrace();
        }


    }

    private static double dividi(int i, int k)
    throws Exception {
double c=i/k;
        return c;

    }
}
