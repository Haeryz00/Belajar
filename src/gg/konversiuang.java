package gg;

import java.util.Scanner;


class conv
{
    double idr;
    double usd;



    private double usd (double idr, double kurs)
    {
        double dollar = idr / kurs;
        return dollar; 
    }

    // private double idr (double usd)
    // {
    //     double rupiah = usd * 15500;
    //     return rupiah;
    // }

    public void displaydl (double idr, double kurs)
    {
        System.out.println(usd(idr,kurs) + " dollar " + " = " + idr + " Rupiah ");
    }
}

public class konversiuang {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("masukan rupiah : ");
        double idr = masuk.nextDouble();

        System.out.print("masukan kurs dollar : ");
        double kurs = masuk.nextDouble();

        conv konv = new conv();

        konv.displaydl(idr,kurs);

        masuk.close();
    }
}
