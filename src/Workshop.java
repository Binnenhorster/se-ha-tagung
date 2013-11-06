import java.util.ArrayList;
import java.util.Date;


public class Workshop {

	private int nummer;
	private String bezeichnung;
	private Date datum;
	private Referent anbieter;
	private ArrayList<Mensch> teilnehmer;
	public Workshop(int nummer, String bezeichnung, Date datum,
			Referent anbieter) {
		super();
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.anbieter = anbieter;
		teilnehmer = new ArrayList<Mensch>();
	}
	
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public Referent getAnbieter() {
		return anbieter;
	}
	public void setAnbieter(Referent anbieter) {
		this.anbieter = anbieter;
	}
	public ArrayList<Mensch> getTeilnehmer() {
		return teilnehmer;
	}
	public void addTeilnehmer(Mensch teilnehmer){
		if(this.anbieter != teilnehmer){
		this.teilnehmer.add(teilnehmer);
		} else {
			System.out.println("Der Anbieter des Workshops kann nicht an seinem eigenen Workshop als Teilnehmer teilnehmen");
		}
	}
	
}
