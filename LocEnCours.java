package voiture;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class LocEnCours {
	private Vector <Location> locList ;
	private Parc P;
	
	 public LocEnCours() {
		super();
		this.locList = new Vector <Location>();
	}
	 
	 
		public void afficherLocation() {
			for  ( Location v : locList ) {
				System.out.println( v.getnCin()+" " + v.getMatricule()+ " " + v.getDateDebut()+ " "+ v.getDateFin()+" "+ v.getPrixDeLocation()+" "+ v.getPrixdAvance());
			}
		}
	
		public void afficherLocationCl(long cin) {
			for  ( Location v : locList ) {
				if ( v.getnCin() == cin) {
				System.out.println( v.getnCin()+" " + v.getMatricule()+ " " + v.getDateDebut()+ " "+ v.getDateFin()+" "+ v.getPrixDeLocation()+" "+ v.getPrixdAvance());
			}}
		}
		
		
	public void ajouterLocation(Location loc) {
		Vehicule v = P.getVoitureById(loc.getMatricule());
		//Client c = P.getClientById(loc.getnCin());
		if (v.getEtat().equals("Disponible")) {
			if (loc.getPrixdAvance() != 0) {
				locList.add(loc);
				v.setEtatloue();
	}
		}
	}
	


	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

	    public static  float getDayCount(String debut, String fin) {
	      long diff = -1;
	      try {
	        Date dateDebut = simpleDateFormat.parse(debut);
	        Date dateFin = simpleDateFormat.parse(fin);

	       
	        diff = Math.round((dateFin .getTime() - dateDebut.getTime()) / (double) 86400000);
	      } catch (Exception e) {
	        
	      }
	      return diff;
	    }


	public void suppLoc(LocHistorique L,String mat,long cin,String dateRemis) {
		for  ( Location v : locList ) {
			if (v.getnCin()==cin) {
				if (v.getMatricule() == mat) {
					locList.remove(v);
					if (getDayCount(v.getDateFin(),dateRemis) >0) {
						System.out.println("Le client est en"+getDayCount(v.getDateFin(),dateRemis)+" jours en retard");
						L.ajouteraHistorique(v, "oui", "oui");
					}
					L.ajouteraHistorique(v, "oui", "non");
				}
			}
			
			}
	}
	
	
}