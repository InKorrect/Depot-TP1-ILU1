package personnages;

import personnages.Trophee;

public class Musee {
	private int[] tableau = new int[200];
	private int nbTrophee=0;
	
	public void donnerTrophees(Gaulois gaulois,Equipement equipement) {
		tableau[nbTrophee]+=1;
		nbTrophee += 1;
	}	
}
