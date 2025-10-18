package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class InvoiceMain {

    public static void main(String[] args) {
        // Lager noen kunder
        Customer c1 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c2 = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.SPOTPRICE);

        // Simulerte strømdata (2 dager × 2 timer)
        double[][] usage1 = {{1.2, 0.9}, {1.1, 1.3}};
        double[][] price1 = {{1.5, 1.6}, {1.7, 1.4}};

        double[][] usage2 = {{2.0, 1.8}, {1.7, 2.1}};
        double[][] price2 = {{0.4, 0.5}, {0.6, 0.5}};

        double[][] usage3 = {{2.1, 2.2}, {1.9, 2.0}};
        double[][] price3 = {{1.8, 1.9}, {2.0, 1.7}};

        // Lager fakturaer for januar
        Invoice[] invoices = {
            new Invoice(c1, "January", usage1, price1),
            new Invoice(c2, "January", usage2, price2),
            new Invoice(c3, "January", usage3, price3)
        };

        // Skriver ut fakturaene
        Invoices.processInvoices(invoices);
    }
}