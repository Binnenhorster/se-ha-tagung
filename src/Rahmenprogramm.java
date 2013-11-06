import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;


public class Rahmenprogramm {

	private String bezeichnung;
	private Date datum;
	private Time zeit;
	private String ort;
	private ArrayList<Teilnehmer> teilnehmer;
	
	public Rahmenprogramm(String bezeichnung, Date datum, Time zeit,
			String ort) {
		super();
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.zeit = zeit;
		this.ort = ort;
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
	public Time getZeit() {
		return zeit;
	}
	public void setZeit(Time zeit) {
		this.zeit = zeit;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public ArrayList<Teilnehmer> getTeilnehmer() {
		return teilnehmer;
	}
	public void addTeilnehmer(Teilnehmer teilnehmer){
		this.teilnehmer.add(teilnehmer);
	}
}
