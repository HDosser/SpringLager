package dosser.lagerverwaltung.lagerverwaltung.model;


import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity
public class Artikel{

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "a_seq_gen")
	@SequenceGenerator(name = "a_seq_gen", sequenceName = "a_seq")
	private long a_id; // ersetzt artikelnummer
	private double preis;
	private String bezeichnung;
	//private int artikelnummer;
	private String verpackungseinheit;

	@ManyToOne
	private Lieferant lieferant;
	@OneToOne(cascade=CascadeType.ALL)
	private Position position;


	public Artikel(){}

	public Artikel(double preis, String bezeichnung, String verpackungseinheit) {
		this.preis = preis;
		this.bezeichnung = bezeichnung;
		this.verpackungseinheit = verpackungseinheit;
	}

	public Artikel(double preis, String bezeichnung, String verpackungseinheit, Lieferant lieferant) {
		this.preis = preis;
		this.bezeichnung = bezeichnung;
		this.verpackungseinheit = verpackungseinheit;
		this.lieferant = lieferant;
	}

	public Artikel(double preis, String bezeichnung, String verpackungseinheit, Lieferant lieferant, Position position) {
		this.preis = preis;
		this.bezeichnung = bezeichnung;
		this.verpackungseinheit = verpackungseinheit;
		this.lieferant = lieferant;
		this.position = position;
	}

	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public String getVerpackungseinheit() {
		return verpackungseinheit;
	}
	public void setVerpackungseinheit(String verpackungseinheit) {
		this.verpackungseinheit = verpackungseinheit;
	}
	public Lieferant getLieferant() {
		return lieferant;
	}
	public void setLieferant(Lieferant lieferant) {
		this.lieferant = lieferant;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public long getA_id() {	return a_id;}
	public void setA_id(long a_id) {this.a_id = a_id;}
}
