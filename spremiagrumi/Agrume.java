package spremiagrumi;

public class Agrume {
	  
	
	AgrumeNome nome;
	    private long colore;
	    //il colore è espresso in esadecimale
	    private int succo;
	    
	 public Agrume(){
		 
	 }
		
	     public Agrume(AgrumeNome nome, long colore, int succo) {
			
			this.nome = nome;
			this.colore = colore;
			this.succo = succo;
		}
		public AgrumeNome getNome() {
			return nome;
		}
		public long getColore() {
			return colore;
		}
		
		public void setNome(AgrumeNome nome) {
			this.nome = nome;
		}
		public void setColore(long colore) {
			this.colore = colore;
		}
		public void setSucco(int succo) {
			this.succo = succo;
		}
		public int getSucco() {
			System.out.println(" frutto spremuto");
			return succo;
		}

	    
}
