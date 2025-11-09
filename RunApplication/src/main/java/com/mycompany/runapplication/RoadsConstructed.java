package com.mycompany.runapplication;

// 2. Abstract class
public abstract class RoadsConstructed implements IRoadsConstructed 
{
    protected String city;
    protected int totalRoadsConstructed;

    
    public RoadsConstructed(String city, int totalRoadsConstructed) 
    {
        this.city = city;
        this.totalRoadsConstructed = totalRoadsConstructed;
    }

   
    @Override
    public String getCity() 
    {
        return city;
    }

    @Override
    public int getTotalRoadsConstructed() 
    {
        return totalRoadsConstructed;
    }
}
