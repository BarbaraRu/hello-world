package contatti;

public class IndirizzoPersona {
	
	private String nomePersona;
	private String cognomePersona;
	private String mailPersona;
	private String telefonoPersona;
    private String nuovaMailPersona;
    private String nuovoNumTelefono;
	
	public IndirizzoPersona(String nomePersona, String cognomePersona, String mailPersona, String telefonoPersona) {
		
		this.nomePersona = nomePersona;
		this.cognomePersona = cognomePersona;
		this.mailPersona = mailPersona;
		this.telefonoPersona = telefonoPersona;
	}


	public String getNomePersona() {
		return nomePersona;
	}


	public void setNomePersona(String nomePersona) {
		this.nomePersona = nomePersona;
	}


	public String getCognomePersona() {
		return cognomePersona;
	}


	public void setCognomePersona(String cognomePersona) {
		this.cognomePersona = cognomePersona;
	}


	public String getMailPersona() {
		return mailPersona;
	}


	public void setMailPersona(String mailPersona) {
		this.mailPersona = mailPersona;
	}


	public String getTelefonoPersona() {
		return telefonoPersona;
	}


	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	public String cambioMail(String mailPersona){
		
		nuovaMailPersona=mailPersona;
		
		return mailPersona;
		
	}

	public String cambioTelefono(String telefonoPersona){
		
		nuovoNumTelefono=telefonoPersona;
		
		return telefonoPersona;
	}
	
	public void stampaPersona(){
		
		System.out.println("dati su "+nomePersona+" "+cognomePersona);
		System.out.println("indirizzo mail: "+mailPersona);
		System.out.println("numero di telefono: "+telefonoPersona);
	}
	
	
	
	@Override
	public String toString() {
		
			return  "Nome: " + this.nomePersona + "\n" +
						"Cognome: " + this.cognomePersona + "\n" +
						"nuova mail: " + cambioMail(nuovaMailPersona) +"\n"+
						"telefono: " + cambioTelefono(nuovoNumTelefono) + "\n" +
"---------------------------------------------";
			}
}
