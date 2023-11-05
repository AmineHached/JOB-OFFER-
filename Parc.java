package voiture;

import java.util.Vector;

public class Parc{
	private Vector <Vehicule> voiture ;
	private Vehicule voit;
	private Vector <Client> clients  ;
	//private Client cl;
	public Parc() {
		super();
		this.voiture = new Vector<Vehicule>();
		this.clients = new Vector<Client>();
	}
	public void afficherVoitures() {
		for  ( Vehicule v : voiture ) {
			System.out.println( v.getNumImm()+" " + v.getConstructeur()+ " " + v.getMarque()+ " "+ v.getEtat());
		}
	}
	
	public void afficherVoituresdisp() {
		for  ( Vehicule v : voiture ) {
			if (v.getEtat().equals("Disponible")) {
			System.out.println( v.getNumImm()+" " + v.getConstructeur()+ " " + v.getMarque()+ " "+ v.getEtat());
			}
		}
	}
	
	public void afficherVoituresloue() {
		for  ( Vehicule v : voiture ) {
			if (v.getEtat().equals("Loué")) {
			System.out.println( v.getNumImm()+" " + v.getConstructeur()+ " " + v.getMarque()+ " "+ v.getEtat());
		}}
	}
	
	
	public void afficherVoituresencr() {
		for  ( Vehicule v : voiture ) {
			if (v.getEtat().equals("en cours de Réparation")) {
			System.out.println( v.getNumImm()+" " + v.getConstructeur()+ " " + v.getMarque()+ " "+ v.getEtat());
		}}
	}
	
	public void ajouterVoitures(Vehicule voit) {
		voiture.add(voit);
	}
	
	public void suppVoitures(String nImm) {
		for  ( Vehicule v : voiture ) {
			if (v.getNumImm().equals(nImm)) {
			voiture.remove(v);
			}
			
			}
	}

	
	public void ajouterClient(Client cl) {
		this.clients.add(cl);
	}
	
	public void suppClient(long nCin) {
		for  ( Client v : clients ) {
			if (v.getnCin()==nCin) {
				clients.remove(v);
			}
			
			}
	}


	public Vehicule getVoit() {
		return voit;
	}
	public void setVoit(Vehicule voit) {
		this.voit = voit;
	}
	public void modifierVoitures(int etat,Vehicule vh) {
		if (etat == 1) {
			vh.setEtatdisp();
		}else if (etat == 2) {
			vh.setEtatloue();
		}else if (etat == 3) {
			vh.setEtatrep();
		}
	}
	
	public Vehicule getVoitureById(String imma) {
		for  ( Vehicule v : voiture ) {
			System.out.println(v.getNumImm());
			if (v.getNumImm().equals(imma)) {
			return v;
			}
			
		}
		return null;
	}
	
	public Client getClientById(long nCin) {
		for  ( Client v : clients ) {
			if (v.getnCin() == nCin) {
			return v;
			}
			
		}
		return null;
	}
}
