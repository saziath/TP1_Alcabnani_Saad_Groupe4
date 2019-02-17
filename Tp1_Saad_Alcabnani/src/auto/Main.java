package auto;


public class Main {

    public static void main(String[] args) {
  Compteur j = new Compteur() ;
            double addKm = 50;
            for(int i =0 ;i <5;i++){
                addKm = 50 + addKm*20*i;
            j.add(addKm);

            System.out.println(j.toString());

            Compteur compteur = new Compteur();
		System.out.println(compteur);
		compteur.add(200);
		System.out.println(compteur);
		compteur.add(300);
		System.out.println(compteur);
		compteur.resetPartiel();
		System.out.println(compteur);
		compteur.add(150);
		System.out.println(compteur);
        /////////////////////////////////////////////////////////////////////

      Vehicule vehicule1 = new Vehicule(5.3);
        Vehicule vehicule2 = new Vehicule(8.7);


        System.out.println(vehicule1);

        double distanceParcourue = vehicule1.rouler(100);
        System.out.println("Le vehicule " + vehicule1.getMatricule() + " a parcouru " +
                ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
        System.out.println(vehicule1);

        distanceParcourue = vehicule1.rouler(300);
        System.out.println("Le vehicule " + vehicule1.getMatricule() + " a parcouru " +
                ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
        System.out.println(vehicule1);

        distanceParcourue = vehicule1.rouler(700);
        System.out.println("Le vehicule " + vehicule1.getMatricule() + " a parcouru " +
                ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
        System.out.println(vehicule1);

        distanceParcourue = vehicule1.rouler(200);
        System.out.println("Le vehicule " + vehicule1.getMatricule() + " a parcouru " +
                ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
        System.out.println(vehicule1);

        vehicule1.rouler(540);
        System.out.println(vehicule1);
        vehicule1.mettreLePlein();
        System.out.println(vehicule1);
        vehicule1.rouler(260);
        System.out.println(vehicule1);

        try {
            vehicule1.mettreDeLessence(6);
        } catch (CapaciteDepasseeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(vehicule1);

        try {
            vehicule1.mettreDeLessence(16);
        } catch (CapaciteDepasseeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(vehicule1);


        System.out.println(vehicule2);
        System.out.println(vehicule1.compareTo(vehicule1));
        System.out.println(vehicule1.compareTo(vehicule2));
//////////////////////////////////////////////////////////////////

        Garage garage = new Garage();

        garage.add(new Vehicule(5.7));
        garage.add(new Vehicule(6.2));
        garage.add(new Vehicule(8.5));
        garage.add(new Vehicule(5.9));
        garage.add(new Vehicule(4.5));
        System.out.println(garage);


        for(Vehicule vehicule : garage.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 3000);
        }
        System.out.println(garage);
        for(Vehicule vehicule : garage.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
      System.out.println(garage);
////////////////////////////////////////////////////////////////////////////

        garage.resetPartielAll();
        System.out.println("\n remise � 0 des compteurs partiels de tous les v�hiculess!");
        System.out.println(garage);

        garage.faireLePleinAll();
        System.out.println("\n faire le plein de tous les v�hicules s'il reste moins de 10 litres !");
        System.out.println(garage);

        System.out.println("sort By Totalisateur");


        garage.sortByTotalisateur();

        System.out.println(garage);

        System.out.println("sort By Matricule");

        garage.sortByMarticule();
        System.out.println(garage);





        Garage garage2 = new Garage();

        garage2.add(new Vehicule(5.7));
        garage2.add(new Vehicule(6.2));
        garage2.add(new Vehicule(8.5));
        garage2.add(new Vehicule(5.9));
        garage2.add(new Vehicule(4.5));
        System.out.println(garage2);

        for(Vehicule vehicule : garage2.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 3000);
        }
        System.out.println(garage2);

        for(Vehicule vehicule : garage2.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(garage2);

        garage2.resetPartielAll();
        System.out.println("\n remise � 0 des compteurs partiels de tous les v�hiculess!");
        System.out.println(garage2);

        garage2.faireLePleinAll();
        System.out.println("\n faire le plein de tous les v�hicules s'il reste moins de 10 litres !");
        System.out.println(garage2);



        Garage garage3 = new Garage();

        garage3.add(new Vehicule(5.7));
        garage3.add(new Vehicule(6.2));
        garage3.add(new Vehicule(8.5));
        garage3.add(new Vehicule(5.9));
        garage3.add(new Vehicule(4.5));
        System.out.println(garage3);

        for(Vehicule vehicule : garage3.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 1000);
        }
        System.out.println(garage3);

        for(Vehicule vehicule : garage3.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(garage);

      //  UtilisationVer1.tri1(garage);


    // Garage Comparable

        Garage garage4 = new Garage();

        garage4.add(new Vehicule(5.7));
        garage4.add(new Vehicule(6.2));
        garage4.add(new Vehicule(8.5));
        garage4.add(new Vehicule(5.9));
        garage4.add(new Vehicule(4.5));
        System.out.println(garage4);

        for (Vehicule vehicule : garage4.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 1000);
        }
        System.out.println(garage4);


        for (Vehicule vehicule : garage4.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(garage);



        garage.add(new Vehicule(5.7));
        garage.add(new Vehicule(6.2));
        garage.add(new Vehicule(8.5));
        garage.add(new Vehicule(5.9));
        garage.add(new Vehicule(4.5));
        System.out.println(garage);

        for(Vehicule vehicule : garage.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 1000);
        }
        System.out.println(garage);

        System.out.println("trié par totaliseur");
        garage.sortByTotalisateur();
        System.out.println(garage);

        System.out.println("trié par matricule");
        garage.sortByMarticule();
        System.out.println(garage);
    }}}
/////////////////////////////////////////////////////////////////////////////
/*
    public static void main(String[] args) {

    System.out.println("######## TESTS DES COMPTEURS ########");
        Main.testCompteur();
        System.out.println("\n\n######## TESTS DES VEHICULES ########");
        Main.testVehicule();

        System.out.println("\n\n######## TESTS DU GARAGE Collection: List ########");
        Main.testGarage1();
        System.out.println("\n\n######## TESTS DU GARAGE Collection: List Mappings ########");
        Main.testMappings1();

        System.out.println("\n\n######## TESTS DU GARAGE Collection: Set Comparable########");
        Main.testGarage2();
        System.out.println("\n\n######## TESTS DU GARAGE Collection: Set CompteurComparator########");
       // Main.testGarage2Bis();
      ///  System.out.println("\n\n######## TESTS DU GARAGE Collection: Set CompteurStaticComparator########");
       //// Main.testGarage2Ter();
        System.out.println("\n\n######## TESTS DU GARAGE Collection: Set Mappings ########");
     //   Main.testMappings2();
    }

    public static void testCompteur() {
        Compteur compteur = new Compteur();
        System.out.println(compteur);
        compteur.add(200);
        System.out.println(compteur);
        compteur.add(300);
        System.out.println(compteur);
        compteur.resetPartiel();
        System.out.println(compteur);
        compteur.add(150);
        System.out.println(compteur);
    }

    public static void testVehicule() {
        Vehicule vehicule1 = new Vehicule(5.3);
        Vehicule vehicule2 = new Vehicule(8.7);
        System.out.println(vehicule1);

        double distanceParcourue = vehicule1.rouler(100);
        System.out.println("Le vehicule " + vehicule1.getMatricule()+ " a parcouru " +
                ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
        System.out.println(vehicule1);

        distanceParcourue = vehicule1.rouler(300);
        System.out.println("Le vehicule " + vehicule1.getMatricule() + " a parcouru " +
                ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
        System.out.println(vehicule1);

        distanceParcourue = vehicule1.rouler(700);
        System.out.println("Le vehicule " + vehicule1.getMatricule() + " a parcouru " +
                ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
        System.out.println(vehicule1);

        distanceParcourue = vehicule1.rouler(200);
        System.out.println("Le vehicule " + vehicule1.getMatricule() + " a parcouru " +
                ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
        System.out.println(vehicule1);

        vehicule1.rouler(540);
        System.out.println(vehicule1);
        vehicule1.mettreLePlein();
        System.out.println(vehicule1);
        vehicule1.rouler(260);
        System.out.println(vehicule1);

        try {
            vehicule1.mettreDeLessence(6);
        } catch (CapaciteDepasseeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(vehicule1);

        try {
            vehicule1.mettreDeLessence(16);
        } catch (CapaciteDepasseeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(vehicule1);


        System.out.println(vehicule2);
        System.out.println(vehicule1.compareTo(vehicule1));
        System.out.println(vehicule1.compareTo(vehicule2));

    }

    public static void testMappings1() {
        Garage garage = new Garage();

        garage.add(new Vehicule(5.7));
        garage.add(new Vehicule(6.2));
        garage.add(new Vehicule(8.5));
        garage.add(new Vehicule(5.9));
        garage.add(new Vehicule(4.5));
        System.out.println(garage);

        for(Vehicule vehicule : garage.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 3000);
        }
        System.out.println(garage);

        for(Vehicule vehicule : garage.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(garage);

        garage.resetPartielAll();
        System.out.println("\n remise � 0 des compteurs partiels de tous les v�hiculess!");
        System.out.println(garage);

        garage.faireLePleinAll();
        System.out.println("\n faire le plein de tous les v�hicules s'il reste moins de 10 litres !");
        System.out.println(garage);
    }


    public static void testMappings2() {
        Garage2 garage = new Garage2();

        garage.add(new Vehicule(5.7));
        garage.add(new Vehicule(6.2));
        garage.add(new Vehicule(8.5));
        garage.add(new Vehicule(5.9));
        garage.add(new Vehicule(4.5));
        System.out.println(garage);

        for(Vehicule vehicule : garage.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 3000);
        }
        System.out.println(garage);

        for(Vehicule vehicule : garage.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(garage);

        garage.resetPartielAll();
        System.out.println("\n remise � 0 des compteurs partiels de tous les v�hiculess!");
        System.out.println(garage);

        garage.faireLePleinAll();
        System.out.println("\n faire le plein de tous les v�hicules s'il reste moins de 10 litres !");
        System.out.println(garage);
    }


    public static void testGarage1() {
        Garage garage = new Garage();

        garage.add(new Vehicule(5.7));
        garage.add(new Vehicule(6.2));
        garage.add(new Vehicule(8.5));
        garage.add(new Vehicule(5.9));
        garage.add(new Vehicule(4.5));
        System.out.println(garage);

        for(Vehicule vehicule : garage.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 1000);
        }
        System.out.println(garage);

        for(Vehicule vehicule : garage.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(garage);

        Main.tri1(garage);

    }


    public static void testGarage2() {
        Garage garage = new Garage();

        garage.add(new Vehicule(5.7));
        garage.add(new Vehicule(6.2));
        garage.add(new Vehicule(8.5));
        garage.add(new Vehicule(5.9));
        garage.add(new Vehicule(4.5));
        System.out.println(garage);

        for(Vehicule vehicule : garage.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 1000);
        }
        System.out.println(garage);

        for(Vehicule vehicule : garage.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(garage);

       // Main.tri2(garage);
    }
////////////////////////////////////////////////////////////gararge 2
    /**
     * Garage CompteurComparateur
     * ATTENTION: il faut d'abord instancier un garage Comparable
     * l'on r�f�rence ensuite par un garage CompteurComparable
     * en effet, les v�hicules ayant tous un compteur � 0 lors de leur instanciation ne seraient pas ajout�s
     * � un garage CompteurComparable, car un Set est sans doublon par rapport au crit�re de comparaison
     */
  /*  public static void testGarage2Bis() {
        Garage garageTemp = new Garage();

        garageTemp.add(new Vehicule(5.7));
        garageTemp.add(new Vehicule(6.2));
        garageTemp.add(new Vehicule(8.5));
        garageTemp.add(new Vehicule(5.9));
        garageTemp.add(new Vehicule(4.5));
        System.out.println(garageTemp);

        Vehicule dummy = new Vehicule(0);
        Garage2 garage = new Garage2(dummy.new CompteurComparator());
        garage = garageTemp;

        for(Vehicule vehicule : garage.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 1000);
        }
        System.out.println(garage);


        for(Vehicule vehicule : garage.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(garage);

        Main.tri2(garage);
    }*/

    /**
     * Garage CompteurStaticComparateur
     * ATTENTION: il faut d'abord instancier un garage Comparable
     * l'on r�f�rence ensuite par un garage CompteurStaticComparable
     * en effet, les v�hicules ayant tous un compteur � 0 lors de leur instanciation ne seraient pas ajout�s
     * � un garage CompteurStaticComparable, car un Set est sans doublon par rapport au crit�re de comparaison
     */
    /*public static void testGarage2Ter() {
        Garage2 garageTemp = new Garage2();

        garageTemp.add(new Vehicule(5.7));
        garageTemp.add(new Vehicule(6.2));
        garageTemp.add(new Vehicule(8.5));
        garageTemp.add(new Vehicule(5.9));
        garageTemp.add(new Vehicule(4.5));
        System.out.println(garageTemp);

        Garage2 garage = new Garage2(Vehicule.CompteurStaticComparator.getCompteurStaticComparator());
        garage = garageTemp;

        for(Vehicule vehicule : garage.getGarage()) {
            vehicule.mettreLePlein();
            vehicule.rouler(Math.random() * 1000);
        }
        System.out.println(garage);


        for(Vehicule vehicule : garage.getGarage()) {
            try {
                vehicule.mettreDeLessence((int) (Math.random() * 100));
            } catch (CapaciteDepasseeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(garage);

        Main.tri2(garage);
    }

    private static void tri1(Garage garage) {
        System.out.println("\n\n##Tri selon le no immatriculation ##");
        garage.sortByMarticule();
        System.out.println(garage);

        System.out.println("\n\n##Tri selon le compteur km totalisateur ##");
        // classes imbriqu�es OK
        // garage.triCompteur();
        // System.out.println(garage);
        // classes imbriqu�es statiques OK
        garage.sortByTotalisateur();
        System.out.println(garage);
    }

    private static void tri2(Garage garage) {////// garage 2
        System.out.println("\n\n##Tri selon le no immatriculation ##");
        garage.sortByMarticule();
        System.out.println(garage);

        System.out.println("\n\n##Tri selon le compteur km totalisateur ##");
        // classes imbriqu�es
        garage.sortByMarticule();
        System.out.println(garage);
        garage.sortByTotalisateur();

        // classes imbriqu�es statiques
        garage.sortByMarticule();
        System.out.println(garage);
        garage.sortByMarticule();

        System.out.println("\n\n##Tri selon le no immatriculation ##");
        garage.sortByMarticule();
        System.out.println(garage);
    }
}*/

