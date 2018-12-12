package dosser.lagerverwaltung.lagerverwaltung.model;

import javax.persistence.*;

@Entity
public class Lieferant {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "l_seq_gen")
	@SequenceGenerator(name = "l_seq_gen", sequenceName = "l_seq")
	private long l_id;
	private String name;
	private String adresse;
	private String ort;
	private String telefonnummer;

	public Lieferant() {
	}

	public Lieferant(String name, String adresse, String ort, String telefonnummer) {
		this.name = name;
		this.adresse = adresse;
		this.ort = ort;
		this.telefonnummer = telefonnummer;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public long getL_id() {	return l_id;}
	public void setL_id(long l_id) {this.l_id = l_id;}
}
