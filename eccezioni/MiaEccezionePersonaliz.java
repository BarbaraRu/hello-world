package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */
public class MiaEccezionePersonaliz extends Exception {

    public MiaEccezionePersonaliz() {
        super("Mia eccezione");
    }

    public String dettagli(){

        System.out.println("metodo dettagli");
        return "dettagli della mia eccezione";
    }
}
