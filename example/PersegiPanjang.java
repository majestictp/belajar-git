package org.example;


public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public double luas() {

        return panjang * lebar;
    }

    public double keliling() {

        return 2 * (panjang + lebar);
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}
