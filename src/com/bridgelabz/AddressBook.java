package com.bridgelabz;
import java.util.Scanner;

public class AddressBook {
    Contacts contact = new Contacts();
    Scanner scanner = new Scanner(System.in);
    void addContact(){

        System.out.print("Enter First Name: ");
        contact.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        contact.setLastName(scanner.nextLine());

        System.out.print("Enter address:  ");
        contact.setAddress(scanner.nextLine());

        System.out.print("Enter city");
        contact.setCity(scanner.next());

        System.out.print("Enter state");
        contact.setState(scanner.nextLine());

        System.out.print("Enter Zipcode");
        contact.setZip(scanner.nextLine());

        System.out.print("Enter phone Number");
        contact.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter email address");
        contact.setEmail(scanner.nextLine());
    }
}