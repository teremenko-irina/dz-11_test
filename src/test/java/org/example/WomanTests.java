package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {

    @Test
    public void testIsRetired() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Assert.assertTrue(woman.isRetired());

        Woman woman2 = new Woman("Sarah", "Brown", 50);
        Assert.assertFalse(woman2.isRetired());
    }

    @Test
    public void testGetFirstName() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Assert.assertEquals(woman.getFirstName(), "Alice");
    }

    @Test
    public void testGetLastName() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Assert.assertEquals(woman.getLastName(), "Johnson");
    }

    @Test
    public void testGetAge() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Assert.assertEquals(woman.getAge(), 65);
    }

    @Test
    public void testGetPartnerLastName() {
        Woman woman = new Woman("Alice", "Johnson", 65);
        Man partner = new Man("Bob", "Smith", 70);
        woman.setPartner(partner);

        Assert.assertEquals(woman.getLastName(),
                "Smith");
    }

}
