package com.bridgelabz;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {
            System.out.println(" Press\n 1 ->  Retrieve data\n 2 -> Exit");
            switch (scanner.nextInt()) {
                case 1:
                    retrieveData();
                    break;
                case 2:
                    exit = true;
            }
        }
    }

    private static void retrieveData() {
        AddressBookRepo addressBookRepo = new AddressBookRepo();
        List<Contacts> employeeInfoList = addressBookRepo.retrieveData();
        for (Contacts employee : employeeInfoList
        ) {
            System.out.println(employee + "\n");
        }
    }
    private static void updateCity() {
        AddressBookRepo addressBookRepo = new AddressBookRepo();
        System.out.println("Enter the address,city,state, zip and Serial Number  to Update");
        addressBookRepo.updateCityByZip(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
    }
    private static void reteriveDataForParticularDate() {
        AddressBookRepo addressBookRepo = new AddressBookRepo();
        System.out.println("Enter the Date of Joining (YYYY-MM-DD");
        System.out.println("Enter year , month and Day ex: 2020 02 03");
        List<Contacts> employeeInfoList = addressBookRepo.findAllForParticularDate(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        for (Contacts employee : employeeInfoList
        ) {
            System.out.println(employee + "\n");
        }
    }
}

