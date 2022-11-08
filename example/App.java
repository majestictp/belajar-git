package org.example;
import java.util.Scanner;

import static java.lang.Math.round;

public class App
{
    public static void main( String[] args )
    {
        persegi P1 = new persegi();
        P1.setSisi(5);
        System.out.println("Persegi");
        System.out.println("Luas Persegi     : " + round(P1.luas()));
        System.out.println("Keliling Persegi : " + round(P1.keliling()) + "\n");

        PersegiPanjang Pp1 = new PersegiPanjang();
        Pp1.setLebar(10);
        Pp1.setPanjang(10);
        System.out.println("Persegi Panjang");
        System.out.println("Luas Persegi Panjang     : " + round(Pp1.luas()));
        System.out.println("Keliling Persegi Panjang : " + round(Pp1.keliling()) + "\n");

        Lingkaran l1 = new Lingkaran();
        l1.setJarijari(10);
        System.out.println("Lingkaran");
        System.out.println("Luas Lingkaran     : " + round(l1.luas()));
        System.out.println("Keliling Lingkaran : " + round(l1.keliling()) + "\n");

        Segitiga S1 = new Segitiga();
        S1.setAlas(30);
        S1.setTinggi(25);
        S1.setSisi(30);
        System.out.println("Segitiga");
        System.out.println("Luas Segitiga     : " + round(S1.luas()));
        System.out.println("Keliling Segitiga : " + round(S1.keliling()) + "\n");

    }
}
