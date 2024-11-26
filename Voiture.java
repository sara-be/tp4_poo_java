public class Voiture extends Vehicule{
    public boolean toitEstReplie;

    public Voiture(int modele, int matricule, double prix){
        super(prix, modele, matricule);
        this.toitEstReplie = false;
    }
    public void replieLeToit(){
        this.toitEstReplie= false;
    }
}