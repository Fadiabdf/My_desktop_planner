
public class Categorie {
	// "Studies","Hobby","Work","Sport","Health"
	  
	   private String nom,couleur ;
	  
	   
	   public Categorie(String nom ,String couleur) {
		   this.nom= nom;
		   this.couleur= couleur;
	   }
	   
	   public String getNom() {
		   return this.nom;
	   }
	   public String getCouleur() {
		   return this.couleur;
	   }
	   public void setNom(String nom) {
		   this.nom=nom;  
	   }
	   public void setCouleur(String couleur) {
		   this.couleur=couleur;  
	   }
	   
}
