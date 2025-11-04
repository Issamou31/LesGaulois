package personnages;

public class Druide {
    private String nom;
    private int force;
    private Chaudron chaudron = new Chaudron();

    public Druide(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le Druide " + nom + " : ";
    }


    public void fabriquerPotion(int doses, int forcePotion) {
        chaudron.remplirChaudron(doses, forcePotion);
        parler("J'ai concocté " + doses + " doses de potion magique. Elle a une force de " + forcePotion + ".");
    }


    public void boosterGaulois(Gaulois gaulois) {
        if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
        } else if (chaudron.resterPotion()) {
            int effetPotion = chaudron.prendreLouche();
            parler("Tiens " + gaulois.getNom() + ", un peu de potion magique !");
            gaulois.boirePotion(effetPotion);
        } else {
            parler("Désolé " + gaulois.getNom() + ", il n'y a plus de potion !");
        }
    }
}


