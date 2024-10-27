package services;

import org.junit.Before;
import org.junit.Test;
import services.decorador.*;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;

public class DarkRoastTest {
    private Beverage b;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        b = new DarkRoast();
        out = new ByteArrayOutputStream();
        System.setOut( new java.io.PrintStream( out ));
    }

    @Test
    public void testCost() {
        double esperado = 0.99;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }

    @Test
    public void testGetDescription() {
        String esperado = "most excellent dark roast";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }

    @Test
    public void testWithMilkAndMochaCost() {
        b = new Milk(b);
        b = new Mocha(b);
        double esperado = 1.29;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }

    @Test
    public void testWithMilkAndMochaDescription() {
        b = new Milk(b);
        b = new Mocha(b);
        String esperado = "most excellent dark roast, with steamed milk, with mocha";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }

    @Test
    public void testToString() {
        String esperado = "darkroast{'description'='most excellent dark roast'}";
        String obtenido = b.toString().toLowerCase();
        assertEquals( esperado, obtenido );
    }
}