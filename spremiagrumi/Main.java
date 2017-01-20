package spremiagrumi;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<Agrume>agrumi=new ArrayList<>();
		
		Agrume a1= new Agrume(AgrumeNome.ARANCIA,0xFF6600,1);
		agrumi.add(a1);
		Agrume a2=new Agrume(AgrumeNome.POMPELMO,0xFF6600,2);
		agrumi.add(a2);
		Agrume a3=new Agrume(AgrumeNome.LIMONE,0xFF6600,1);
		agrumi.add(a3);
		
		SpremiAgrumi sp1=new SpremiAgrumi();
		sp1.getSucco(agrumi);
		System.out.println("ecco"+ sp1.getSucco(agrumi)+"bicchieri di succo");
	}

}
