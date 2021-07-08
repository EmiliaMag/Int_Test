package Exercises;

public class Car extends Vehicul implements Strada{

    String volan;

    Car(String volanP, int rotiP, String nrInmatriculareP){
        super(rotiP, nrInmatriculareP);
        volan=volanP;
    }
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Volan: " + volan);
    }

}
