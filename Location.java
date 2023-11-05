package voiture;

public class Location {
	private long nCin;
    private String matricule;
    private String dateDebut;
    private String dateFin;
    private double prixDeLocation;
    private double prixdAvance;
    public Location(long nCin, String matricule, String dateDebut, String dateFin,double prixDeLocation ,double prixdAvance) {
		super();
		this.nCin = nCin;
		this.matricule = matricule;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixDeLocation = prixDeLocation;
		this.prixdAvance = prixdAvance;
	}
	public long getnCin() {
		return nCin;
	}
	public void setnCin(long nCin) {
		this.nCin = nCin;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public double getPrixDeLocation() {
		return prixDeLocation;
	}
	public void setPrixDeLocation(double prixDeLocation) {
		this.prixDeLocation = prixDeLocation;
	}
	public double getPrixdAvance() {
		return prixdAvance;
	}
	public void setPrixdAvance(float prixdAvance) {
		this.prixdAvance = prixdAvance;
	}
    
	
	
}
