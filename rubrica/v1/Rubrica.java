package rubrica.v1;

import java.util.Vector;

public class Rubrica {
	
	private Vector elenco;
	
	public Rubrica()
	
	{elenco=new Vector();}
	
	public void aggiungiVoce(Object obj)
	{
		elenco.addElement(obj);
	}
	
	public void eliminaVoce(int posizione){
		
		Object obj=null;
		int size;
		size =elenco.size(); //size metodo della classe vector; returns the number of components in this vector.
		
		if (size>0){
			obj=elenco.elementAt(0);
			
			elenco.removeElementAt(posizione); //Deletes the component at the specified index.
		}
		return;
		
	}
	public int size(){
		return elenco.size();
	}
	
	public void visualizzaElenco(){
		
		for (int i=0;i<elenco.size();i++){
			System.out.println("posizione "+i);
			
			Voce voce = (Voce)elenco.elementAt(i); //cast
			voce.Stampa();
		}
		
	}
		
	}
	
	


