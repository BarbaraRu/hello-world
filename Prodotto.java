package negozio;

public class Prodotto {
	
	private String prodotto;
	private double prezzo;
	
	public Prodotto(String nomepr, double prezzopr){
		
		prodotto=nomepr;
		prezzo= prezzopr;
	}

	public String getProdotto() {
		return prodotto;
	}

	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
}
