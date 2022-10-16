package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois=0;
	
	public Village(String nom,int nbVillageoisMax) {
		this.nom = nom;
		villageois=new Gaulois[nbVillageoisMax];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]= (gaulois);
		nbVillageois+=1;
	}
	public void trouverHabitant(int numVillageois) {
		System.out.println(villageois[numVillageois]); 
	}
	public static void main(String[] args) {
		Village village= new Village("Village des Irréductibles",30);
	}
}
