package voiture;

public class Client {
	 private long nCin;
	 private String nom ;
	 private String prenom;
	 private String adresse;
	 public Client(String nom,int nCin , String prenom, String adresse ) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.nCin = nCin  ;
		}

	public long getnCin() {
		return nCin;
	}
	public void setnCin(long nCin) {
		this.nCin = nCin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
