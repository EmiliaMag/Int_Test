package Exercises;

public class Main {

    public static void main(String[] args) {
        Car masina=new Car("Are volan albastru", 4, "423423");
        masina.afiseaza();

        Moto motocicleta= new Moto("Are ghidon", 2, "453454");
        motocicleta.afiseaza();

        Car bmw= new Car("Are volan de BMW", 4, "423423");


        Moto suzuki= new Moto("Are ghigon de Suzuki", 2, "453454");
        suzuki.afiseaza();
        bmw.afiseaza();
    }

}
