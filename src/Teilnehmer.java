
public class Teilnehmer extends Mensch {

	private String status;
	
	public Teilnehmer(String name, String eMail, String status) {
		super(name, eMail);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
