package org.example;


public class persegi extends BangunDatar {
    private double sisi;

    public double luas() {

        return getSisi() * getSisi();
    }

    public double keliling() {

        return 2 * (getSisi() + getSisi());
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }
}
