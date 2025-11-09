package com.mycompany.runapplication;

import java.util.Scanner;


public class RunApplication 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the city for road construction: ");
        String city = scanner.nextLine();

        System.out.print("Enter the total road construction for " + city + ": ");
        int totalRoads = scanner.nextInt();

        // Create report object
        RoadConstructionReport report = new RoadConstructionReport(city, totalRoads);

        // Print report
        report.printRoadsConstructedReport();

        scanner.close();
    }
}
