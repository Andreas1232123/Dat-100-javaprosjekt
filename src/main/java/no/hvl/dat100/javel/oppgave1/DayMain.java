package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1a");
        System.out.println("==============");
        System.out.println();
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println("==============");
        System.out.println("OPPGAVE 1b");
        System.out.println("==============");
        System.out.println();
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println("==============");
        System.out.println("OPPGAVE 1c");
        System.out.println("==============");
        System.out.println(DailyPower.computePowerUsage(powerusage_day));
        System.out.println("==============");
        System.out.println("OPPGAVE 1d");
        System.out.println("==============");
        System.out.println(DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println("==============");
        System.out.println("OPPGAVE 1e");
        System.out.println("==============");
        double powerHour =powerusage_day[7];
        double powerPrice =powerprices_day[7];
        double time=(DailyPower.getSupport(powerHour,powerPrice));
        System.out.println(time);
        System.out.println("==============");
        System.out.println("OPPGAVE 1f");
        System.out.println("==============");
        System.out.println(DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.println("==============");
        System.out.println("OPPGAVE 1g");
        System.out.println("==============");
        System.out.println(DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println("==============");
        System.out.println("OPPGAVE 1h");
        System.out.println("==============");
        System.out.println(DailyPower.findPeakUsage(powerusage_day));
        System.out.println("==============");
        System.out.println("OPPGAVE 1i");
        System.out.println("==============");
        double averageusage=(DailyPower.findAvgPower(powerusage_day));
        System.out.println(averageusage);
        


    }
}
