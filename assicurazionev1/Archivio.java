package progetti.assicurazionev1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;


public class Archivio {
	
	private ArrayList<Cliente>clienti;
	
	Scanner input = new Scanner(System.in);
	
	public void creaClienti(){
		
		clienti= new ArrayList<>();
		
		clienti.add(new Cliente("Mario Rossi"));
		clienti.add(new Cliente("Maria Bianchi"));
		clienti.add(new Cliente("dfgodfhodifh"));
		clienti.add(new Cliente("abccii"));
		
	}
	
	
	
	public void inserisciCliente(){
		
		System.out.println("inserisci il nome di nuovo cliente:");
		String nuovoCliente=input.next();
		clienti.add(new Cliente(nuovoCliente));
		
		
		
}
	
	public void eliminaCliente(){
		System.out.println("Inserisci il numero di posizione cliente");
		int posizCliente=input.nextInt();
		clienti.remove(posizCliente);
		System.out.println("cliente rimosso");
	
		
		
		
	}
	
	}
	
	
	
	
			


