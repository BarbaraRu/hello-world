package autoveicoli;

public class Camion extends Veicolo {
	
	private int numAssi;
	
public Camion(){
		
		super();
		numAssi=2;
	}
	
	public Camion(int numAssi, int matricola, String proprieta){
		super(matricola,proprieta);
		this.numAssi=numAssi;
	}

	

	public int getNumAssi() {
		return numAssi;
	}

	public void scriviOutput(){
		super.scriviOutput();

System.out.println("numero degli assi:" +numAssi);
	
	}

}
