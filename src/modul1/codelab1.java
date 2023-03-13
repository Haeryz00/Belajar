package modul1;

import java.util.Scanner;

    class demoConv
    {
        
        // demoConv (double meter)
        // {
        //     this.meter = meter;
        // }

        double meter;
        public double convCM (double meter)
        {
            double cent = meter * 100;
            return cent;
        }

        public double conMM (double meter)
        {
            double mill = meter * 1000;
            return mill;
        } 

        public void dispConv (double meter)
        {
            System.out.println(meter + " meter = " + convCM(meter) + " centi  meter" + "," + conMM(meter) + " milimeter");
        }
    }

public class codelab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        demoConv konversi = new demoConv();
        System.out.println("masukan nilai meter : ");
        double meter = input.nextDouble();

        
        konversi.dispConv(meter);
        
    }
}
