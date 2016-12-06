package negozio;

import java.util.Scanner;

public class NegozioTester {

	public static void main(String[] args) {
		
Negozio negozio = new Negozio("Gelataio","Tom");

negozio.setIndirizzo("Via roma 2");
negozio.setTelefono("011-45646");
negozio.setSito("www.google.it");

Scanner input = new Scanner(System.in);

boolean devoUscire = false;
while(!devoUscire) {
	System.out.println("Inserisci un comando: \nelenca, \nnegozio, \nacquista, \naggiungi, \nq per uscire ");
	String c = input.next();
	if (c.equals("q")) {
		devoUscire = true;
	} else if (c.equals("elenca")) {
		negozio.elencaProdotti();
	} else if (c.equals("negozio")) {
		System.out.println("Nome: " + negozio.getNomeNegoziante());
		System.out.println("Nome negozio:" + negozio.getNome());
		System.out.println("Indirizzo: " + negozio.getIndirizzo());
		System.out.println("Telefono: " + negozio.getTelefono());
		System.out.println("Sito web: " + negozio.getSito());
		System.out.println("Incasso: € " + negozio.getIncasso());
	} else if (c.equals("acquista")) {
		negozio.elencaProdotti();
		System.out.println("Inserisci il numero del prodotto:");
		int pos = input.nextInt();
		Prodotto pr = negozio.vendiProdotto(pos);
		System.out.println("Hai acquistato " + pr.getProdotto() +
							" per € " + pr.getPrezzo());
	} else if (c.equals("aggiungi")) {
		System.out.println("Inserisci nome:");
		String n = input.next();
		System.out.println("Inserisci prezzo:");
		double p = input.nextDouble();
		Prodotto prodotto = new Prodotto(n, p);
		negozio.nuovoProdotto(prodotto);
	}
}

input.close();
		
	}

}
