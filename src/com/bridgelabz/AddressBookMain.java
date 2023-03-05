package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Contacts contact = new Contacts();
        contact.setFirstName("Sayed");
        contact.setLastName("Faizan");
        contact.setAddress("H3/76, Jammu");
        contact.setCity("Kashmir");
        contact.setState("Jammu and kashmir");
        contact.setZip("185212");
        contact.setPhoneNumber("(+91) 9086123394");
        contact.setEmail("sayedhappu@mail.com");

        System.out.println(contact.getFirstName());
        System.out.println(contact.getLastName());
        System.out.println(contact.getAddress());
        System.out.println(contact.getCity());
        System.out.println(contact.getState());
        System.out.println(contact.getZip());
        System.out.println(contact.getPhoneNumber());
        System.out.println(contact.getEmail());
    }
}