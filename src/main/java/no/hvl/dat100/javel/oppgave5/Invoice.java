package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class Invoice {

    private Customer c;        // Customer knyttet til fakturaen
    private String month;      // Måned fakturaen gjelder for
    private double[][] usage;  // Strømforbruk (per dag og time)
    private double[][] prices; // Strømpriser for måneden
    private double amount;     // Total strømpris for måneden

    // a) Konstruktør
    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    // b) Beregner total strømpris
    public void computeAmount() {
        double total = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                double used = usage[i][j];
                double price = prices[i][j];

                // Beregning basert på avtaletype
                switch (c.getAgreement()) {
                    case SPOTPRICE:
                        total += used * price;
                        break;
                    case POWERSUPPORT:
                        total += used * price * 0.9; // 10% rabatt
                        break;
                    case NORGESPRICE:
                        total += used * 0.5; // fast lav pris
                        break;
                }
            }
        }

        amount = total;
    }

    // c) Skriver ut faktura
    public void printInvoice() {
        double totalUsage = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                totalUsage += usage[i][j];
            }
        }

        System.out.println("Customer number " + c.getCustomerId());
        System.out.println("Name  " + c.getName());
        System.out.println("Email " + c.getEmail());
        System.out.println("Agreement " + c.getAgreement());
        System.out.println();
        System.out.println("Month: " + month);
        System.out.printf("Usage: %10.2f kWh%n", totalUsage);
        System.out.printf("Amount: %10.2f NOK%n", amount);
    }

    // Hjelpemetode for å hente ut beløpet (kan brukes i tester)
    public double getAmount() {
        return amount;
    }
}