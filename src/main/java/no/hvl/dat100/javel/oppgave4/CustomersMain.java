package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customerList = new Customers(10);

        Customer c1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT);

        customerList.addCustomer(c1);
        customerList.addCustomer(c2);
        customerList.addCustomer(c3);
        customerList.addCustomer(c4);
        customerList.addCustomer(c5);

        System.out.println("Antall kunder: " + customerList.countNonNull());

        Customer hentet = customerList.getCustomer(1003);
        System.out.println("\nHentet kunde 1003:");
        System.out.println(hentet);

        Customer fjernet = customerList.removeCustomer(1002);
        System.out.println("\nFjernet kunde 1002:");
        System.out.println(fjernet);

        System.out.println("\nEtter fjerning, antall kunder: " + customerList.countNonNull());

        Customer[] aktive = customerList.getCustomers();
        System.out.println("\nAktive kunder:");
        for (Customer c : aktive) {
            System.out.println(c);
            System.out.println("-----------");
        }
    }
}