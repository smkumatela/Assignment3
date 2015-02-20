package za.ac.cput.person;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/18.
 */
public class TestMyList {
    @Test
    public void testAdding() throws Exception {
        PeopleNames mntu = new PeopleNames();
        mntu.addNickName("Beauty");
        Assert.assertEquals("beauty", mntu.people.get(0));
    }


    @Test
    public void testRemove() throws Exception {
        PeopleNames mntu2 = new PeopleNames();
        mntu2.addNickName("Sora_man");
        mntu2.addNickName("Bunito");
        mntu2.addNickName("Woolverine");  // Add Five Elements To The List
        mntu2.addNickName("The Beast");
        mntu2.addNickName("mana_mana");

        mntu2.removePerson("Bunito"); // Remove object at position 1

        Assert.assertEquals("Object Removed Successfully", "Woolverine", mntu2.people.get(1));  // Test That Object Was Removed

    }
}
