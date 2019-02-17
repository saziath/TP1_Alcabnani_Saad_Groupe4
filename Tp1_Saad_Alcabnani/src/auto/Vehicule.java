/**
 *
 * @author saad1
 */
package auto;

public class Vehicule  {

    private int matricule;
    private static int count = 0;
    private final double capacite;
    private Compteur compteur;
    private double jaugeReservoir;
    private final double consoKm ;




    public Vehicule(double consoKm) {
        this.matricule = count++;
        Compteur c = new Compteur();
        this.compteur = c;
        this.capacite = 50;
        this.jaugeReservoir = 0;
        this.consoKm = consoKm;
    }


    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public Compteur getCompteur() {
        return compteur;
    }

    public void setCompteur(Compteur compteur) {
        this.compteur = compteur;
    }

    public double getJaugeReservoir() {
        return jaugeReservoir;
    }

    public void setJaugeReservoir(double jaugeReservoir) {
        this.jaugeReservoir = jaugeReservoir;
    }

    public double getConsoKm() {
        return consoKm;
    }



      public double getCapacite() {
        return capacite;
    }

    public void mettreLePlein(){
        this.jaugeReservoir = capacite;

    }
    public void mettreDeLessence(double QantitéARajouter)throws CapaciteDepasseeException{

        if((jaugeReservoir+ QantitéARajouter)>= capacite){


            throw new CapaciteDepasseeException("Votre réservoir a une capacité insuffisante pour mettre "+ QantitéARajouter +" L d'essence");
        }
        else{

            this.jaugeReservoir= jaugeReservoir+ QantitéARajouter;

        }

    }

    public double rouler(double distanceSouhaité){

        double distanceReelementParcourue;
        double conso;

      // distanceReelementParcourue =jaugeReservoir / (consoKm/100);
        conso = distanceSouhaité*(consoKm/100);



        if(this.jaugeReservoir <= conso ){

            distanceReelementParcourue =jaugeReservoir / (consoKm/100);

            compteur.add(distanceReelementParcourue);

            mettreLePlein();

            return distanceReelementParcourue;
        }
        else{

         this.jaugeReservoir = jaugeReservoir - conso ;
            compteur.add(distanceSouhaité);
            return distanceSouhaité;
        }

    }
    public int compareTo(Vehicule vehicule2 ){

        int val = 5;
        if(this.matricule == vehicule2.getMatricule()){ val = 0;
         return val ;}
        else if(this.matricule <= vehicule2.getMatricule()){ val = -1;
         return val ;}
        else if(this.matricule >= vehicule2.getMatricule()){ val = 1;
         return val ;}
        return val;





    }

    public Double getTotalisateur(){
        double totalisateur = this.compteur.getTotalisateur();
        return  totalisateur;
    }

    public  int compareToTotalisateur(Vehicule vehicule2){

        int val = 5;
        if(this.compteur.getTotalisateur() == vehicule2.getCompteur().getTotalisateur()){ val = 0;
            return val ;}
        else if(this.compteur.getTotalisateur() <= vehicule2.getCompteur().getTotalisateur()){ val = -1;
            return val ;}
        else if(this.compteur.getTotalisateur() >= vehicule2.getCompteur().getTotalisateur()){ val = 1;
            return val ;}
        return val;



    }
    @Override
    public String toString() {

        return "\n Véhicule "+ (int)matricule+" : compteur =[ totalisateur = "+(int) compteur.getTotalisateur()+"| partiel = "+(int) compteur.getPartiel() + " ] ; jauge = "+ jaugeReservoir+"\n";

    }





}
