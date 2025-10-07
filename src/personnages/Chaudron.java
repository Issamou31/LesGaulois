package personnages;

public class Chaudron {
	private int nbDoses;

	public Chaudron() {
		this.nbDoses = 0;
	}

	public boolean resterPotion() {
		return nbDoses > 0;
	}

	public void remplirChaudron(int nbDoses) {
		this.nbDoses = nbDoses;
	}

	public void utiliserDose() {
		if (nbDoses > 0) {
			nbDoses--;
		}
	}
}
