package contatti;

import java.util.Scanner;

public class IndirizzoTester {

	public static void main(String[] args) {
		
		
		IndirizzoPersona persona1= new IndirizzoPersona("Barbara","R","nn@google.com","011546532");
		IndirizzoPersona persona2= new IndirizzoPersona("Alessandra","R","aa@google.com","011525452");
		
		Scanner input= new Scanner(System.in);
		
		persona1.stampaPersona();
		System.out.println("------------------");
		persona2.stampaPersona();
		
		
		//cambiare la mail e num di telefono:
		
		System.out.println("inserisci la nuova mail di "+persona1.getNomePersona()+" "+persona1.getCognomePersona());
		String nuovaMail=input.next();
		
		System.out.println("inserisci il nuovo telefono di "+persona1.getNomePersona()+" "+persona1.getCognomePersona());
		String nuovoTel=input.next();
		
		persona1.cambioMail(nuovaMail);
		persona1.cambioTelefono(nuovoTel);
		
		System.out.println(persona1.toString());
		
		
		System.out.println("Confronto dati persone:");
		
		
		
		if(persona1.getCognomePersona().equals(persona2.getCognomePersona()))
				{
			
		System.out.println("hanno lo stesso cognome");
		
				if(persona1.getNomePersona().equals(persona2.getNomePersona())){
					
					System.out.println("hanno lo stesso nome");
				}
					}
		
		else System.out.println("non hanno gli stessi dati");
	}

}
