package voiture;

import java.util.Vector;

public class LocHistorique {
	private String etat;
	private String retard;
	private Vector <LocHistorique> locList;
	private Location loc;
	public LocHistorique(Location loc ,String etat,String retard) {
		super();
		this.loc = loc;
		this.etat = etat;
		this.retard = retard;
	}
	
	
	public LocHistorique() {
		super();
		this.locList = new Vector<LocHistorique>();
	}


	public void afficherHistorique() {
		for  ( LocHistorique v : locList ) {
			System.out.println( v.loc.getnCin()+" " + v.loc.getMatricule()+ " " + v.loc.getDateDebut()+ " "+ v.loc.getDateFin()+" "+v.loc.getPrixDeLocation()+" "+v.loc.getPrixdAvance()+" "+this.etat+this.retard);
		}
	}
	
	public void ajouteraHistorique(Location loc,String et,String rt) {
		LocHistorique L = new LocHistorique(loc, rt, rt);
		
		locList.add(L);
	}
	
	public void afficherRiskListe() {
		for  ( LocHistorique v : locList ) {
			if (v.etat.equals("non") || v.retard.equals("oui")) {
				Parc p1 = new Parc();
				Client v1 = p1.getClientById(v.loc.getnCin());
				
			System.out.println( v1.getnCin()+" " + v1.getNom()+ " " + v1.getPrenom()+ " "+ v1.getAdresse());
		}}
	}
	
}
