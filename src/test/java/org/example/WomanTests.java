package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {

    @Test(groups = "getters")
    public void testGetFirstName() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Assert.assertEquals(woman.getFirstName(), "Alice", "Incorrect first name");
    }

    @Test(groups = "getters")
    public void testGetLastName() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Assert.assertEquals(woman.getLastName(), "Johnson", "Incorrect last name");
    }

    @Test(groups = "getters")
    public void testGetAge() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Assert.assertEquals(woman.getAge(), 65, "Incorrect age");
    }

    @Test(groups = "getPartner")
    public void testGetPartnerLastName() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Man partner = new Man("Bob", "Smith", 70);
        woman.setPartner(partner);

        Assert.assertEquals(woman.getLastName(), "Smith", "Incorrect partner last name");
    }

    @Test(groups = "isRetired")
    public void testIsRetired() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Assert.assertTrue(woman.isRetired(), "Expected retired");

        Woman woman2 = new Woman("Sarah", "Brown", 50);
        Assert.assertFalse(woman2.isRetired(), "Expected not retired");
    }
}
