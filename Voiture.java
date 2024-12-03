public class Voiture extends Vehicule implements Decapotable{
    public final int nbMaxVoitures = 100;

    public Voiture(int modele, int matricule, double prix){
        super(prix, modele, matricule);
        this.toitEstReplie = false;
    }
    public void replieLeToit(){
        this.toitReplie= !toitReplie;
    }
}