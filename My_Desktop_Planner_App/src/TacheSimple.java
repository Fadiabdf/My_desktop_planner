
public class TacheSimple extends Tache {
	
	private Periode Periode ;
	private CreneauLibre creneau;
	
	public TacheSimple(String nom,int duree, Priorite Pr,Date  datelim,Categorie categorie,Etat etat_realisation,Periode Periode,CreneauLibre creneau)
	{
	super(nom,duree,Pr,datelim,datelim,categorie,etat_realisation);
	this.Periode=Periode;
	this.creneau=creneau;
	}
	public void afficherTache() {
		
	}
	public boolean decomposer() {
		
	}
	public void reporter(Periode P) {
		
	}
	public void fixercreneau(CreneauLibre C) {
		
	}
	

}
