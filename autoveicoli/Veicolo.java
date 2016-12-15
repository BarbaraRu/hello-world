package autoveicoli;

public class Veicolo {
	private int numMatricola;
	private String proprietario;
	
	public Veicolo(){
		numMatricola=0;
		proprietario=null;
	}

	public Veicolo(int numMatricola, String proprietario) {
		
		this.numMatricola = numMatricola;
		this.proprietario = proprietario;
	}

	public int getNumMatricola() {
		return numMatricola;
	}

	public String getProprietario() {
		return proprietario;
	}

	
	
	
public void scriviOutput(){
		
	Veicolo v = new Auto();	
	Veicolo c = new Camion();
	Veicolo m = new Moto();
	
	System.out.println("nome proprietario: "+proprietario +" numero di matricola del veicolo: "+numMatricola);
	
	if(v instanceof Auto){
		System.out.println("il veicolo è un auto"); }
	else
	if(c instanceof Camion)
		System.out.println("il veicolo è un camion");
	else
	if(m instanceof Moto)
		System.out.println("il veicolo è una moto");
	
	
		}
		}
	
	

	
