package spremiagrumi;

import java.util.List;

public class SpremiAgrumi {

	public int getSucco(List<Agrume>agrumi){

		int bicchieri=0;
		
		for(Agrume a:agrumi){
			System.out.println(a.nome );
			bicchieri+=a.getSucco();
		}
		return bicchieri;
		
		
		
	}
	
}
