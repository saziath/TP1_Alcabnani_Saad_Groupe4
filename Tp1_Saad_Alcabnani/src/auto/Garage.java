
/**
 *
 * @author saad1
 */
package auto;


import java.util.*;


public  class Garage {


    private List<Vehicule> garage = new ArrayList<>();

    public Garage() {
        this.garage = garage;
    }

    public List<Vehicule> getGarage() {
        return garage;
    }

    public void add(Vehicule vehicule){
        this.garage.add(vehicule);
    }

    public void resetPartielAll(){

        for(Vehicule vehicule : this.garage) {
            vehicule.getCompteur().setPartiel(0);
        }
    }

    public void faireLePleinAll(){

        for(Vehicule vehicule : this.garage) {

            if(vehicule.getJaugeReservoir()< 10){
            vehicule.mettreLePlein();
        }
        }
    }

    public void sortByMarticule(){

        Collections.sort(garage, new Comparator<Vehicule>() {
            @Override
            public int compare(Vehicule o1, Vehicule o2) {
                return o1.compareTo(o2);
            }
        });
        /*ListIterator<Vehicule> listIterator = garage.listIterator();


                while (listIterator.hasNext()){
                    int i ;
                    i=((Vehicule)listIterator).compareTo(listIterator.next());
                   System.out.println(i);
                    /* if(i == -1){

                    }*/

                }



    public void sortByTotalisateur(){

        Collections.sort(garage, new Comparator<Vehicule>() {
            @Override
            public int compare(Vehicule o1, Vehicule o2) {
                return o1.compareToTotalisateur(o2);
            }
        });
        /*ListIterator<Vehicule> listIterator = garage.listIterator();


                while (listIterator.hasNext()){
                    int i ;
                    i=((Vehicule)listIterator).compareTo(listIterator.next());
                   System.out.println(i);
                    /* if(i == -1){

                    }*/

    }




    @Override
    public String toString() {
        return "Garage{" +
                "garage=" + garage +
                '}';
    }
}
