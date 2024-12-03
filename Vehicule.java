public class Vehicule implements Motorisation{

    private int matricule;
    private int modele;
    private double prix;

    private double capaciteReservoir;
    private double quantiteCarburant; 

    private int dernierVidange;

    public Vehicule(int modele,int matricule, double prix){
        this.matricule += 1;
        this.modele = modele;
    }
    public int getaMatricule(){
        return matricule;
    }
    public int getModele(){
        return modele;
    }
    public double getPrix(){
        return prix;
    }
    public void setModele(int modele) {
        this.modele = modele;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String toString(){
        return "Modèle : " +modele+ "Matricule: " +matricule+ "Prix:"+ prix;
    }
    public double addCarburant(double quantite){
        if(this.quantiteCarburant+quantite <= capaciteReservoir ){
            return quantitaCarburant += quantite;
        }else{
            System.ot.print("La quantité ajoutée dépasse la capacité de la véhicule!")
        }
    }
    public periodiciteVidange(){
        if(this.typeCarburant === DEISEL){
            System.out.print("La périodicité du vidange est 10mois")
        }
        elseif(this.typeCarburant === ESSENCE){
            System.out.print("La périodicité du vidange est 12mois")
        }
        elseif(this.typeCarburant === GAZ){
            System.out.print("La périodicité du vidange est 18mois")
        }
    }
}