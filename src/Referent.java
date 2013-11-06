
public class Referent extends Mensch {

	private String firma;
	
	
	public Referent(String name, String eMail, String firma) {
		super(name, eMail);
		this.firma = firma;
	}


	public String getFirma() {
		return firma;
	}


	public void setFirma(String firma) {
		this.firma = firma;
	}

	
	
	
}
