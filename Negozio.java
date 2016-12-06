package negozio;

import java.util.ArrayList;

public class Negozio {

private String indirizzo;
private String telefono;
private String sito;
private String nomeNegozio;
private String nomeNegoziante;
private double incasso;

private ArrayList <Prodotto> prodotti= new ArrayList<Prodotto>();

public Negozio(String n,String nb){
	
	setNome( nb);
	setNomeNegoziante(n);
creaProdotti();
}

public void creaProdotti(){
	//inizializzare l'array list
	prodotti =new ArrayList<>();
	//elenco add
	prodotti.add(new Prodotto("Cioccolato",1.50));
	prodotti.add(new Prodotto("Crema",1.00));
	prodotti.add(new Prodotto("Fragola",1.00));
	prodotti.add(new Prodotto("Pistacchio",1.20));
}



public String getNome() {
	
	return nomeNegozio;
}

public void setNome(String nome) {
	nomeNegozio = nome;
}


public String getNomeNegoziante() {
	return nomeNegoziante;
}

public void setNomeNegoziante(String nomeNegoziante) {
	this.nomeNegoziante = nomeNegoziante;
}



public String getIndirizzo() {
	return indirizzo;
}

public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getSito() {
	return sito;
}

public void setSito(String sito) {
	this.sito = sito;
}

public double getIncasso() {
	return incasso;
}

public void setIncasso(double incasso) {
	this.incasso = incasso;
}

public void setProdotti(ArrayList<Prodotto> prodotti) {
	this.prodotti = prodotti;
}


public void elencaProdotti() {
	int i =1;
	for(Prodotto prodotto: prodotti){
		System.out.println(i+" "+prodotto.getProdotto()+":"+"prezzo"+prodotto.getPrezzo());
	i++;
	}
	
	
}

public Prodotto vendiProdotto(int pos){
	
	Prodotto p = prodotti.get(pos-1);
	incasso = incasso + p.getPrezzo();
	// rimuovo il prodotto dalla lista
	prodotti.remove(pos-1);
return p;
}
public void nuovoProdotto(Prodotto prodotto) {
	prodotti.add(prodotto);		
}




}

