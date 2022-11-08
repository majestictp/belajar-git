package org.example;

public class Lingkaran extends BangunDatar{
    private double jarijari;

    public double luas() {

        return 3.14 * (jarijari * jarijari);
    }

    public double keliling() {

        return 2 * (3.14 * jarijari);
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
