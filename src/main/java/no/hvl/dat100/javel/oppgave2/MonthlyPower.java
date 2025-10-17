package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for(int i=0; i < usage.length; i++) {
            System.out.println();
            System.out.println("Dag "+ i);
            for(int j=0; j < usage[i].length; j++) {
                
                System.out.printf("%.2f kWh ", usage[i][j]);
            }
            System.out.println();    
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
          for(int i=0; i < prices.length; i++) {
            System.out.println();
            System.out.println("Dag "+ i);
            for(int j=0; j < prices[i].length; j++) {
                
                System.out.printf(prices[i][j] + " NOK ");
            }
            System.out.println();    
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;
        for(int i=0; i < usage.length; i++) {
            for(int j=0; j < usage[i].length; j++) {
                sum+=usage[i][j];
            }
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

    double usage = 0;
    int i = 0, j = 0;

    while (i < powerusage.length && usage < threshold) {
        while (j < powerusage[i].length && usage < threshold) {
            usage += powerusage[i][j];
            j++;
        }
        i++;
        j = 0;
    }

    return usage > threshold;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
         for (int i = 0; i < usage.length && i<prices.length; i++) {
            for (int j = 0; j < usage[0].length && j<prices[0].length; j++) {
                price+=usage[i][j] * prices[i][j];     
            }
        }
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {
        double PERCENTAGE = 0.9;
        double THRESHOLD = (0.9375*24)*30;
        double support = 0;
        double price=0;
        for (int i = 0; i < usage.length && i < prices.length; i++) {
            for (int j = 0; j < usage[0].length && j < prices[0].length; j++) {
                price+=usage[i][j] * prices[i][j];
                if (price>THRESHOLD) {
                support=price * PERCENTAGE;
                support=price-support;
                }
            }
        }
    
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {
        double price = 0;
        double NORGESPRIS_KWH = 0.5;
        for (int i = 0; i < usage.length; i++) {
            for(int j = 0; j < usage[0].length; j++) {
            price+=usage[i][j] * NORGESPRIS_KWH;
            }
        }
        return price;
    }
}
