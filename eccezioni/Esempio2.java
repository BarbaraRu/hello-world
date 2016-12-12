package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */
public class Esempio2  {    //lanciare una eccezione

    public static void main(String[] args) {

        try{
            throw new Exception("Eccezione personalizzata");
        } catch (Exception e) {
            System.out.println("Catturata l'eccezione: ");
            System.out.println("Il messaggio: "+ e.getMessage());
            //e.printStackTrace();
        }

    }
}
