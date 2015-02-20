package za.ac.cput.employee;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class BasicPTest {
    private basicP base;

    @Before
    public void setUp() throws Exception {
        base = new BasecPImpl();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testBasicP() throws Exception {
        Assert.assertEquals(1249.5, base.basic(25.50, 49));
    }
}
