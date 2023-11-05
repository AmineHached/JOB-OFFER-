package voiture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

		static Parc p1 = new Parc();
		
		static LocHistorique LH = new LocHistorique();
		
		static LocEnCours LEC = new LocEnCours();
		public static long cin;
		public static String imm;
		public static String marque;
		public static String constructeur;
		public static long ncin;
		public static String datedeb;
		public static String datefin;
		public static double prxtotal;
		public static double prxav;
	public static void main(String[] args) {
        String option = "";
        Client cl = new Client("tmimi", 12527825, "ghassen", "ariana 12 rue ar");
        
        p1.ajouterClient(cl);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do
        {
        	
            System.out.println("A. Gestion du Parc de l’Agence");
            System.out.println("B. Gestion Locations");
            System.out.println("C. Statistiques");
            System.out.println("F. Exit");
            System.out.println("===========================================");
            System.out.println("Enter an option");
            System.out.println("===========================================");
            try {
				option = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("\n");

            switch(option.toUpperCase())
            {
                case "A":
                    viewOne();
                    break;

                case "B":
                    viewTwo();
                    break;

                case "C":
                    viewThree();
                    break;

                case "F":
                    System.out.println("******************************THANK YOU********************");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option! Please enter again");
                    break;
            }
        }while(!option.equals("F"));
    
	
	
	}
	
	
        public static void viewOne()
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String option = "";
        	System.out.println("1. Nouvelle acquisition (Ajout d’un véhicule)");
            System.out.println("2. Modification de l’Etat d’un Véhicule");
            System.out.println("3. Suppression d’un Véhicule ");
            System.out.println("4. Consultation Parc (tous les véhicules)");
            System.out.println("5. Liste des véhicules loués");
            System.out.println("6. Liste des véhicules en cours de réparation");
            System.out.println("7. Liste des véhicules disponibles");
            System.out.println("8. Exit");
            System.out.println("===========================================");
            System.out.println("Enter an option");
            System.out.println("===========================================");
            try {
				option = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("\n");
            switch(option.toUpperCase())
            {
                case "1":
                	
				try {
					System.out.println("immatricule");
					option = br.readLine();
					imm = option;
					System.out.println("constructeur");
					option = br.readLine();
					constructeur = option;
					System.out.println("marque");
					option = br.readLine();
					marque = option;
					Vehicule v1 = new Vehicule(imm, constructeur,marque, "Disponible");
		        	p1.ajouterVoitures(v1);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                	
                    break;

                case "2":
                	
				try {
					System.out.println("immatricule");
					option = br.readLine();
					imm = option;
					System.out.println("1- Dispo  2-Loué  3-en cour de reparation");
					option = br.readLine();
					 Vehicule v;
					switch(option.toUpperCase())
			            {
					 
			            case "1":
		                    v = p1.getVoitureById(imm);
		                    
		                    v.setEtatdisp();
		                    break;

		                case "2":
		                	 v = p1.getVoitureById(imm);
			                    v.setEtatloue();
		                    break;

		                case "3":
		                	 v = p1.getVoitureById(imm);
			                    v.setEtatrep();
		                    break;
		                default:
		                    System.out.println("Invalid Option! Please enter again");
		                    break;
			            }
			            }
				 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
                    break;

                case "3":
                	
				try {
					System.out.println("immatricule");
					option = br.readLine();
					imm = option;
					 p1.suppVoitures(imm);
					 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
                    break;
                case "4":
                	  p1.afficherVoitures();	
                    break;

                case "5":
                	p1.afficherVoituresloue();
                    break;

                case "6":
                    p1.afficherVoituresencr();
                    break;
                case "7":
                    p1.afficherVoituresdisp();
                    break;

                case "8":
                    System.out.println("******************************THANK YOU********************");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option! Please enter again");
                    break;
            }
        }
    
        public static void viewTwo()
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String option = "";
        	System.out.println("1. Nouvelle Location (Ajout d’une location)");
            System.out.println("2. Fin de Location (Suppression)");
            System.out.println("3. Consultation des locations en cours ");
            System.out.println("4. Consultation des Véhicules Loués par un client");
            System.out.println("8. Exit");
            System.out.println("===========================================");
            System.out.println("Enter an option");
            System.out.println("===========================================");
            try {
				option = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("\n");
            switch(option.toUpperCase())
            {
                case "1":
                	try {
    					System.out.println("ncin");
    					option = br.readLine();
    					cin = Long.parseLong(option);
    					System.out.println("matricule");
    					option = br.readLine();
    					constructeur = option;
    					System.out.println("date debut");
    					option = br.readLine();
    					datedeb = option;
    					System.out.println("date fin");
    					option = br.readLine();
    					datefin = option;
    					System.out.println("prix de location");
    					option = br.readLine();
    					prxtotal = Float.valueOf(option);
    					System.out.println("prix d avance");
    					option = br.readLine();
    					prxav = Float.valueOf(option);
    					Location l1 = new Location(cin, constructeur,datedeb, datefin,prxtotal,prxav);
    		        	LEC.ajouterLocation(l1);
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
                    break;

                case "2":
                	
				try {
					System.out.println("matricule");
					option = br.readLine();
					imm = option;
					System.out.println("date fin");
					option = br.readLine();
					datefin = option;
					System.out.println("ncin");
					option = br.readLine();
					cin = Long.parseLong(option);
					LEC.suppLoc(LH, imm, cin, datefin);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
                    break;	

                case "3":
                	
                	LEC.afficherLocation();
                    break;
                case "4":
                	try {
    					System.out.println("ncin");
    					option = br.readLine();
    					cin = Long.parseLong(option);
    					
                	}
    					catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    				
                    break;
                case "8":
                    System.out.println("******************************THANK YOU********************");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option! Please enter again");
                    break;
            }
        }
    
        public static void viewThree()
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String option = "";
        	System.out.println("1. Nombre de locations pour une période déterminée");
            System.out.println("2. Total des revenus pour une période déterminée");
            System.out.println("3. Liste des clients à risque (Retard / mauvais état de véhicules rendus)");
            System.out.println("8. Exit");
            System.out.println("===========================================");
            System.out.println("Enter an option");
            System.out.println("===========================================");
            try {
				option = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("\n");
            switch(option.toUpperCase())
            {
                case "1":
                    //viewOne();
                    break;

                case "2":
                    //viewTwo();
                    break;

                case "3":
                    LH.afficherRiskListe();
                    break;
                case "8":
                    System.out.println("******************************THANK YOU********************");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option! Please enter again");
                    break;
            }
        }
    
	
        
        
	

}
