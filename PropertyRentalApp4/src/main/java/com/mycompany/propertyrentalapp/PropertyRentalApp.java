package com.mycompany.propertyrentalapp;

import java.util.Scanner;

public class PropertyRentalApp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Property propertyManager = new Property();

        while (true) 
        {
            System.out.println("\nPROPERTY RENTALS - 2025");
            System.out.println("....................");
            System.out.print("Enter (1) to launch menu or any other key to exit: ");
            String start = scanner.nextLine();

            if (!start.equals("1")) 
            {
                propertyManager.exitPropertyApplication();
            }

            System.out.println("\nPlease select one of the following menu items:");
            System.out.println("(1) Enter new property.");
            System.out.println("(2) Search for property.");
            System.out.println("(3) Update property.");
            System.out.println("(4) Delete a property.");
            System.out.println("(5) Print property report - 2025.");
            System.out.println("(6) Exit Application.");

            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) 
            {
                case "1":
                    propertyManager.enterProperty();
                    break;
                case "2":
                    propertyManager.searchProperty();
                    break;
                case "3":
                    propertyManager.updateProperty();
                    break;
                case "4":
                    propertyManager.deleteProperty();
                    break;
                case "5":
                    propertyManager.propertyRentalReport();
                    break;
                case "6":
                    propertyManager.exitPropertyApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}


