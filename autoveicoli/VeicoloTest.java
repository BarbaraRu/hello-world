package autoveicoli;

public class VeicoloTest {

	public static void main(String[] args) {
		
		//Auto auto1= new Auto("berlina",1254,"Mario Rossi");
		//auto1.scriviOutput();
		Veicolo a=new Auto("berlina",1254,"Mario Rossi");
		Veicolo b=new Camion(2,1255,"Mario bianchi");
		
		a.scriviOutput();
		b.scriviOutput();
		
	}

}
