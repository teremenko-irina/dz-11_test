package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {

    @Test(groups = "getters")
    public void testGetFirstName() {
        Man man = new Man("John", "Doe", 70);
        Assert.assertEquals(man.getFirstName(), "John", "Incorrect first name");
    }

    @Test(groups = "getters")
    public void testGetLastName() {
        Man man = new Man("John", "Doe", 70);
        Assert.assertEquals(man.getLastName(), "Doe", "Incorrect last name");
    }

    @Test(groups = "getters")
    public void testGetAge() {
        Man man = new Man("John", "Doe", 70);
        Assert.assertEquals(man.getAge(), 70, "Incorrect age");
    }

    @Test(groups = "isRetired")
    public void testIsRetired() {
        Man man = new Man("John", "Doe", 70);
        Assert.assertTrue(man.isRetired(), "Expected retired");

        Man man2 = new Man("Jane", "Smith", 40);
        Assert.assertFalse(man2.isRetired(), "Expected not retired");
    }
}
