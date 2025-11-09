package com.mycompany.propertyrentalapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Property 
{
    private ArrayList<PropertyModel> properties = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 1. Enter Property
    public void enterProperty() 
    {
        System.out.println("ENTER A NEW PROPERTY FOR RENTAL...");
        System.out.print("Enter the property id: ");
        String id = scanner.nextLine();

        System.out.print("Enter the property address: ");
        String address = scanner.nextLine();

        double rentalAmount = propertyAmountValidation();

        System.out.print("Enter the property agent: ");
        String agent = scanner.nextLine();

        properties.add(new PropertyModel(id, address, rentalAmount, agent));
        System.out.println("New property processed successfully!!!");
    }

    // 2. Search Property 
    public void searchProperty() 
    {
        System.out.print("Enter the property id to search: ");
        String id = scanner.nextLine();

        for (PropertyModel p : properties) 
        {
            if (p.propertyId.equals(id)) 
            {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Rental property with property Id: " + id + " was not found!");
    }

    // 3. Update Property 
    public void updateProperty() 
    {
        System.out.print("Enter the property id to update: ");
        String id = scanner.nextLine();

        for (PropertyModel p : properties) 
        {
            if (p.propertyId.equals(id)) 
            {
                System.out.print("Enter the property address: ");
                p.propertyAddress = scanner.nextLine();

                p.propertyRentalAmount = propertyAmountValidation();

                System.out.print("Enter the property agent: ");
                p.agentName = scanner.nextLine();

                System.out.println("Property updated successfully!");
                return;
            }
        }
        System.out.println("Property with id " + id + " not found!");
    }

    // 4. Delete Property (console version)
    public void deleteProperty() 
    {
        System.out.print("Enter the property id to delete: ");
        String id = scanner.nextLine();

        for (int i = 0; i < properties.size(); i++) 
        {
            if (properties.get(i).propertyId.equals(id)) 
            {
                System.out.print("Are you sure you want to delete property " + id + "? Yes (y) to delete: ");
                String confirm = scanner.nextLine();

                if (confirm.equalsIgnoreCase("y")) 
                {
                    properties.remove(i);
                    System.out.println("Property with Property Id: " + id + " WAS deleted!");
                } else 
                {
                    System.out.println("Delete cancelled.");
                }
                return;
            }
        }
        System.out.println("Property with id " + id + " not found!");
    }

    // 5. Property Report
    public void propertyRentalReport() 
    {
        if (properties.isEmpty()) 
        {
            System.out.println("No properties available!");
            return;
        }

        int count = 1;
        for (PropertyModel p : properties) 
        {
            System.out.println("Property " + count);
            System.out.println(p);
            System.out.println("----------------------------");
            count++;
        }
    }

    // 6. Validate Rental Amount
    public double propertyAmountValidation() 
    {
        double rentalAmount = 0;
        while (true) 
        {
            try 
            {
                System.out.print("Enter the property rental price per month: ");
                rentalAmount = Double.parseDouble(scanner.nextLine());
                if (rentalAmount >= 1500) 
                {
                    break;
                } else 
                {
                    System.out.println("You have entered an invalid amount!!! Please re-enter (>=1500).");
                }
            } catch (NumberFormatException e) 
            {
                System.out.println("You have entered an invalid amount!!! Only numbers allowed.");
            }
        }
        return rentalAmount;
    }

    // 7. Exit
    public void exitPropertyApplication() 
    {
        System.out.println("Exiting application. Goodbye!");
        System.exit(0);
    }

   
    public ArrayList<PropertyModel> getProperties() 
    {
        return properties;
    }

    // Search by ID 
    public PropertyModel searchPropertyById(String id) 
    {
        for (PropertyModel p : properties) 
        {
            if (p.propertyId.equals(id)) 
            {
                return p;
            }
        }
        return null;
    }

    // Update by ID 
    public boolean updateProperty(String id, String newAddress, double newAmount, String newAgent) 
    {
        for (PropertyModel p : properties) 
        {
            if (p.propertyId.equals(id)) 
            {
                if (newAmount < 1500) 
                {
                    throw new IllegalArgumentException("Invalid rental amount (<1500)");
                }
                p.propertyAddress = newAddress;
                p.propertyRentalAmount = newAmount;
                p.agentName = newAgent;
                return true;
            }
        }
        return false;
    }

    // Delete by ID 
    public boolean deleteProperty(String id) 
    {
        return properties.removeIf(p -> p.propertyId.equals(id));
    }

    // Validate rental amount 
    public boolean isRentalAmountValid(double amount) 
    {
        return amount >= 1500;
    }
}

