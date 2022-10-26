package personnages;


import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	int nbVillageois = 0;
	personnages[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.villageois = new personnages[nbVillageoisMaximum];
		this.nom = nom;
	}

	public void ajouterHabitant(personnages gaulois) {
		this.villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public personnages trouverHabitant(int numeroVillageois) {
		return villageois[numeroVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef " + this.chef.getNom()
				         + " vivent les legendaires gaulois :");
		
		for (int i = 0 ; i < nbVillageois ; i++){
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	


	public String getNom() {
		// TODO Auto-generated method stub
		this.nom = nom;
		return null;
	}

}