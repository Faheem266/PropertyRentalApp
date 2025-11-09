package com.mycompany.propertyrentalapp.test;

import com.mycompany.propertyrentalapp.Property;
import com.mycompany.propertyrentalapp.PropertyModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTest 
{
    private Property propertyManager;

    @BeforeEach
    void setUp() 
    {
        propertyManager = new Property();
        // Insert one property to work with
        propertyManager.getProperties().add(
                new PropertyModel("101", "10 Main Road, 6001", 3500, "Joe Bloggs")
        );
    }

    @Test
    void SearchProperty_ReturnsProperty() 
    {
        PropertyModel result = propertyManager.searchPropertyById("101");
        assertNotNull(result);
        assertEquals("10 Main Road, 6001", result.propertyAddress);
        assertEquals(3500, result.propertyRentalAmount);
        assertEquals("Joe Bloggs", result.agentName);
    }

    @Test
    void SearchProperty_NotFound() 
    {
        PropertyModel result = propertyManager.searchPropertyById("999");
        assertNull(result);
    }

    @Test
    void UpdateProperty_ReturnsSuccess() 
    {
        boolean updated = propertyManager.updateProperty(
                "101", "15 Sea Street, 6070", 3800, "Jane Doe"
        );
        assertTrue(updated);

        PropertyModel result = propertyManager.searchPropertyById("101");
        assertEquals("15 Sea Street, 6070", result.propertyAddress);
        assertEquals(3800, result.propertyRentalAmount);
        assertEquals("Jane Doe", result.agentName);
    }

    @Test
    void DeleteProperty_ReturnsSuccess() 
    {
        boolean deleted = propertyManager.deleteProperty("101");
        assertTrue(deleted);
        assertNull(propertyManager.searchPropertyById("101"));
    }

    @Test
    void PropertyAmountValidation_AmountIsValid() 
    {
        assertTrue(propertyManager.isRentalAmountValid(2000));
    }

    @Test
    void PropertyAmountValidation_AmountIsInvalid() 
    {
        assertFalse(propertyManager.isRentalAmountValid(1200));
    }
}
