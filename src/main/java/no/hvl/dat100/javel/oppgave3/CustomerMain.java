package no.hvl.dat100.javel.oppgave3;

import java.util.Scanner;
import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

    
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();

        // For simplicity, we assign fixed values for ID and agreement
        int customerId = 1001;
        PowerAgreementType agreement = PowerAgreementType.SPOTPRICE;

        Customer customer = new Customer(name, email, customerId, agreement);

        System.out.println("\nCustomer created:");
        System.out.println(customer);

        scanner.close();
    }
}