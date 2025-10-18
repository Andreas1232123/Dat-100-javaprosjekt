package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        customers = new Customer[size]; // Lager en tabell med plass til 'size' kunder
    }

    // b) count number of non-null references
    public int countNonNull() {
        int count = 0;

        for (Customer c : customers) {
            if (c != null) {
                count++; // Teller antall plasser som ikke er null (altså hvor en kunde er lagret)
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        for (Customer c : customers) {
            if (c != null && c.getCustomerId() == customer_id) {
                return c; // Returnerer kunden hvis ID matcher
            }
        }

        return null; // Fant ingen kunde med gitt ID
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c; // Legger inn kunden på første ledige plass
                return true;
            }
        }

        return false; // Ingen plass ledig
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomerId() == customer_id) {
                Customer removed = customers[i];
                customers[i] = null; // Fjerner kunden ved å sette plassen til null
                return removed;
            }
        }

        return null; // Fant ingen kunde med gitt ID
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        int count = countNonNull();
        Customer[] result = new Customer[count];

        int j = 0;
        for (Customer c : customers) {
            if (c != null) {
                result[j] = c;
                j++;
            }
        }

        return result; // Returnerer ny tabell med bare aktive kunder (uten null-verdier)
    }
}