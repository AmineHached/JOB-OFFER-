package voiture;

public class Vehicule {
	public String numImm ;
	public String constructeur;
	public String marque ;
	public String etat;
	
	
	public Vehicule(String numImm,String constructeur,String marque,String etat) {
		
		super();
		this.numImm = numImm;
		this.constructeur = constructeur;
		this.marque = marque;
		this.etat = etat;
		
		
	}
	
	public String getNumImm() {
		return numImm;
	}
	public void setNumImm(String numImm) {
		this.numImm = numImm;
	}
	public String getConstructeur() {
		return constructeur;
	}
	public void setConstructeur(String constructeur) {
		this.constructeur = constructeur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtatdisp() {
		this.etat = "Disponible";
	}
	public void setEtatloue() {
		this.etat = "Loué";
	}
	public void setEtatrep() {
		this.etat = "en cours de Réparation";
	}
	
















}
