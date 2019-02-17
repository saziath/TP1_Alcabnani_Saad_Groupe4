/**
 *
 * @author saad1
 */
package auto;

public class Compteur {
    private double totalisateur;
    private double partiel;
    private final int uneCons = 1000;

    public Compteur() {
        this.totalisateur = 0;
        this.partiel = 0;
    }


    public double getTotalisateur() {
        return totalisateur;
    }

    public void setTotalisateur(double totalisateur) {
        this.totalisateur = totalisateur;
    }

    public double getPartiel() {
        return partiel;
    }

    public void setPartiel(double partiel) {
        this.partiel = partiel;
    }

    public int getUneCons() {
        return uneCons;
    }
    public void resetPartiel() {


            this.partiel =this.partiel- uneCons;


    }
    public void add(double addKm){

        this.partiel=this.partiel+ addKm;
        this.totalisateur = this.totalisateur + addKm ;
            if(this.partiel >= uneCons){
        resetPartiel();
        }
    }

    @Override
    public String toString() {
        return "Compteur{" +
                "totalisateur=" + (int) totalisateur +
                ", partiel=" +(int)  partiel +
                "}'";
    }
}
