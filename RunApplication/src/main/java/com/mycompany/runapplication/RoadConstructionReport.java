package com.mycompany.runapplication;

// 3. Subclass
public class RoadConstructionReport extends RoadsConstructed 
{

    
    public RoadConstructionReport(String city, int totalRoadsConstructed) 
    {
        super(city, totalRoadsConstructed);
    }

    // Report
    public void printRoadsConstructedReport() 
    {
        System.out.println("\nROAD CONSTRUCTION REPORT");
        System.out.println("************************");
        System.out.println("CITY: " + getCity());
        System.out.println("ROADS CONSTRUCTED: " + getTotalRoadsConstructed());
        System.out.println("************************");
    }
}
