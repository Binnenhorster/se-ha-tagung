
public abstract class Mensch {

	private String name;
	private String eMail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public Mensch(String name, String eMail) {
		super();
		this.name = name;
		this.eMail = eMail;
	}

	
}
