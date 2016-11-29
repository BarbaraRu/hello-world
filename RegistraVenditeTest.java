package vendite;

import java.util.Scanner;

public class RegistraVenditeTest {

	public static void main(String[] args) {
		
		int nVenduto;
	
		int nIngrosso;
		
		RegistraVendite prodotto1=new RegistraVendite(15,(0.22));

		prodotto1.setCostoPerArticolo(15);
		prodotto1.setScontoIngrosso(0.22);
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("inserisci il numero di prodotto venduto: ");
		
		nVenduto=input.nextInt();
		
		System.out.println("inserisci la quantità all'ingrosso: ");
		nIngrosso =input.nextInt();
		
		System.out.println(prodotto1.registraVendita(nVenduto,nIngrosso));
		
		double totVendite= 0;
		int scontotot=0;
		prodotto1.mostraVendite(nVenduto, totVendite, scontotot);
	}

}
