
public abstract class Tache {

	private String nom;
	private int duree;//unitee d'heure
	private Priorite Pr;
	private Date  datelim;
	private Categorie categorie;
	private Etat etat_realisation;
	
	public Tache(String nom,int duree,Priorite Pr,Date datelim,Categorie categorie,Etat etat_realisation) {
		
		this.nom = nom;
		this.duree=duree;
		this.Pr=Pr;
		this.datelim =datelim;
		this.categorie=categorie;
		this.etat_realisation=etat_realisation;
		this.categorie=categorie;	
	}
	
	public void afficher_tache() {
		
	}
	public abstract boolean decomposer();
	
		
	
}
