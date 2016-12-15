package autoveicoli;

public class Auto extends Veicolo {
	
	private String modello;
	
	public Auto(){
		
		super();
		modello=null;
	}
	
	public Auto(String modello, int matricola, String proprieta){
		super(matricola,proprieta);
		this.modello=modello;
	}

	public String getModello() {
		return modello;
	}


	public void scriviOutput(){
		super.scriviOutput();

System.out.println("modello dell'auto:" +modello);

	}
	
}
