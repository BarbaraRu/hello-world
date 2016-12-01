package progetti.zaino;

import java.util.Scanner;

public class ZainoViewer {
	
	
	
	public static void main(String[] args) {
		
		Zaino z= new Zaino("Invicta","Barbara",5);
		
		Scanner input =new Scanner(System.in);
		boolean esci=false;
		
		while(!esci){
			
			System.out.println("Inserisci comando:");
			String comando = input.next();
			
			if(comando.equals("q")){esci=true;}
			else if (comando.equals("elenca")){
				z.elencaCose();
				
			}
			else if (comando.equals("metti")){
				
				System.out.println("scrivi il nome dell'oggetto da inserire: ");
				String nome= input.next();
				System.out.println("scrivi la descrizione dell'oggetto da inserire: ");
				String descrizione= input.next();
				Cosa c = new Cosa(nome, descrizione);
				boolean stato=z.inserisciCosa(c);
				if(stato)
					System.out.println("elemento inserito correttamente");
				else System.out.println("Failed.Lo zaino è pieno");
				//z.inserisciCosa(c);
				
			}
			else if (comando.equals("prendi")){
				z.elencaCose();
				System.out.println("Dammi posizione oggetto da prendere");
				int pos= input.nextInt();
				z.prendiCosa(pos);
				z.elencaCose();
				
			}
			
		}

	}

}
