package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {

    @Test
    public void testIsRetired() {
        Man man = new Man("John", "Doe", 70);
        Assert.assertTrue(man.isRetired());

        Man man2 = new Man("Jane", "Smith", 40);
        Assert.assertFalse(man2.isRetired());
    }

    @Test
    public void testGetFirstName() {
        Man man = new Man("John", "Doe", 70);
        Assert.assertEquals(man.getFirstName(), "John");
    }

    @Test
    public void testGetLastName() {
        Man man = new Man("John", "Doe", 70);
        Assert.assertEquals(man.getLastName(), "Doe");
    }

    @Test
    public void testGetAge() {
        Man man = new Man("John", "Doe", 70);
        Assert.assertEquals(man.getAge(), 70);
    }

}
