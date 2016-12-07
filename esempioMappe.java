package esempi.week8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import progetti.aula.v3.*;
public class esempioMappe {

	private static Map<String,Studente> studenti=new HashMap<>();	
	
	private List<Studente> listaStudenti;
	
	public static void main(String[] args) {
		
Studente s1 = new Studente("gfhgh", "ghjhj",'F');
Studente s2 = new Studente("dfsfjsf", "gfghfghf",'M');	

//System.out.println(s1.getMatricola());
	
 studenti.put(s1.getCognome(), s1);
 studenti.put(s2.getCognome(), s2);
 
// values ritorna l'elenco dei valori
for(Studente stud:studenti.values()){
	 System.out.println(stud.getNome());
	 
	 // il keySet ritorna l'elenco delle chiavi
	 for (String string:studenti.keySet()){
		 
		 if(studenti.containsKey(string));{
			
		 //System.out.println(string);
		 Studente std=studenti.get(string);
		 System.out.println("chiave: "+std.getNome()+"valore: "+std.getCognome());
	 }
	 
 }

	}

}
	}
