package org.example;

public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;

    private double sisi;

    public double luas() {

        return 0.5 * alas * tinggi;
    }

    public double keliling() {

        return sisi + sisi + sisi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
