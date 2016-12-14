package rubrica.v1;

import java.util.Scanner;

public class Voce {

	private String nomeCognome;
	private String numeroTelefono;
	
	public Voce(){
		
		nomeCognome = new String();
		numeroTelefono= new String();
	}
	



	public void Stampa(){
		
		System.out.println("Nome e Cognome: "+this.nomeCognome);
		System.out.println("Telefono: "+this.numeroTelefono);
		
	}
	
	public void inserisciVoce(){
		
	Scanner input=new Scanner(System.in);
		
	this.nomeCognome=input.nextLine();
	this.numeroTelefono=input.nextLine();
		
		
	}

}
