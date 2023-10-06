package personnages;

public class Village {

	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		villageois = new Gaulois[nbVillageoisMaximum];
		
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public String getChef() {
		return chef.getNom();
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans "+ getNom() + " du chef " + getChef() + " vivent les légendaires gaulois");
		for(int i=0;i<nbVillageois;i++)
		{
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		Les villageois ne sont pas initialisés
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		Asterix est le deuxieme habitant du village
		village.afficherVillageois();
		
		
		
		
				
		
	}
}
