package com.bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook{

    ArrayList<Contacts> list = new ArrayList<>();
    Contacts contact = new Contacts();
    Scanner scanner = new Scanner(System.in);
    void addContact(){

        System.out.print("Enter First Name: ");
        contact.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        contact.setLastName(scanner.nextLine());

        System.out.print("Enter Address:  ");
        contact.setAddress(scanner.nextLine());

        System.out.print("Enter City: ");
        contact.setCity(scanner.nextLine());

        System.out.print("Enter State: ");
        contact.setState(scanner.nextLine());

        System.out.print("Enter Zip-code: ");
        contact.setZip(scanner.nextLine());

        System.out.print("Enter Phone Number: ");
        contact.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Email-ID: ");
        contact.setEmail(scanner.nextLine());

        list.add(contact);
    }

    void editContact() {
        boolean search = false;

        System.out.print("\nEnter First Name: ");
        String firstName = scanner.next();

        for (Contacts contact : list){

            if (firstName.equals(contact.getFirstName())){
                System.out.println("Contact Found");
                System.out.println("Edit Contact Details....");

                System.out.print("Enter First Name: ");
                contact.setFirstName(scanner.nextLine());

                System.out.print("Enter Last Name: ");
                contact.setLastName(scanner.nextLine());

                System.out.print("Enter Address:  ");
                contact.setAddress(scanner.nextLine());

                System.out.print("Enter City: ");
                contact.setCity(scanner.nextLine());

                System.out.print("Enter State: ");
                contact.setState(scanner.nextLine());

                System.out.print("Enter Zip-code: ");
                contact.setZip(scanner.nextLine());

                System.out.print("Enter Phone Number: ");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.print("Enter Email-ID: ");
                contact.setEmail(scanner.nextLine());
                break;
            }
            else
                System.out.println("Contact Not Found");
        }

    }

    void deleteContact(){
        System.out.print("\nEnter First Name: ");
        String firstName = scanner.next();

        if (firstName.equals(contact.getFirstName())){
            contact=null;
            System.out.println("Contact Deleted");
        }
        else
            System.out.println("Contact Not Found");
    }

    void displayContact(){

        if(list.isEmpty()){
            System.out.println("Address Book is Empty");
        }
        else {
            for (Contacts contact : list) {
                System.out.println(contact);
            }
        }

    }
}