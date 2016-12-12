package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */
public class Esempio5 {//eccezione personalizzata

    public static void main(String[] args) {

       //metodo che non lancia eccezioni
        try {
            test(1);
            //metodo che lancia un eccezione
            test(0);
        } catch (MiaEccezionePersonaliz e) {
            e.getMessage();
           e.dettagli();
        }
    }

    public static void test(int i) throws MiaEccezionePersonaliz{

        if(i==0) throw new MiaEccezionePersonaliz();
        System.out.println("ciao");
    }
}
