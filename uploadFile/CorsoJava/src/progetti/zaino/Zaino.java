package progetti.zaino;

import java.util.ArrayList;

public class Zaino {
	
	private String marca;
	private String proprietario;
	private int maxQuantita;
	
	private ArrayList<Cosa>cose;
	
	public Zaino(String marca, String proprietario, int maxQuantita) {
		
		this.marca = marca;
		this.proprietario = proprietario;
		this.maxQuantita = maxQuantita;
		
		creaCose();
	}

	private void creaCose() {
		cose=new ArrayList<>();
		
		cose.add(new Cosa("Portapenne","UomoRagno"));
		cose.add(new Cosa("Portachiavi","Batman"));
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getMaxQuantita() {
		return maxQuantita;
	}

	public void setMaxQuantita(int maxQuantita) {
		this.maxQuantita = maxQuantita;
	}

	public ArrayList<Cosa> getCose() {
		return cose;
	}

	public void setCose(ArrayList<Cosa> cose) {
		this.cose = cose;
	}
	
	public void elencaCose(){
		int i=1;
		for(Cosa cosa:cose){
			
		
			System.out.println(cosa);
			System.out.println(i+") "+ cosa.getNome()+" " +cosa.getDescriz());
		
			i++;
			
		}
		
		
	}
		
		public boolean inserisciCosa(Cosa c){
			if (maxQuantita>cose.size()){
				
				cose.add(c);
				return true;
			}
			return false;
			
		}
		
		public Cosa prendiCosa(int posizione){
			
			
			Cosa c = cose.get(posizione);
			cose.remove(posizione);
			return c;
		}
		
	}
	


