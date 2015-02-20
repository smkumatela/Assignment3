package za.ac.cput.employee;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestOverTime {
    private OverTimeP ovtp;

    @Before
    public void setUp() throws Exception {
        ovtp = new OverTimePImpl();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testOverTimeP() throws Exception {
        Assert.assertEquals(6247.5, ovtp.OverT(1249.5, 5));
    }
}
