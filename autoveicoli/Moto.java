package autoveicoli;

public class Moto extends Veicolo {
	
	private int numPosti;
	
public Moto(){
		
		super();
		numPosti=1;
	}
	
	public Moto(int numPosti, int matricola, String proprieta){
		super(matricola,proprieta);
		this.numPosti=numPosti;
	}

	

	public int getNumPosti() {
		return numPosti;
	}

	public void scriviOutput(){
		super.scriviOutput();

System.out.println("numero di posto della moto:" +numPosti);
	
	}


}
