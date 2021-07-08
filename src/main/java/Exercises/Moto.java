package Exercises;

public class Moto extends Vehicul {

    String ghidon;

    Moto(String ghidonP, int rotiP, String nrInmatriculareP){
        super(rotiP, nrInmatriculareP);
        ghidon=ghidonP;
    }
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Ghidon: " + ghidon);
    }

}
