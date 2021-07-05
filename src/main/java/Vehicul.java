public class Vehicul {

    int roti;
    String nrInmatriculare;

    Vehicul(int rotiP, String nrInmatriculareP) {
        roti=rotiP;
        nrInmatriculare=nrInmatriculareP;
    }

    public void afiseaza() {
        System.out.println("Numar roti: " + roti);
        System.out.println("Numar inmatriculare: " + nrInmatriculare);
    }




}
