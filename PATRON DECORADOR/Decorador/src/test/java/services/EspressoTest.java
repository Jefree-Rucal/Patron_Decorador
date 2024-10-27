package services;

import org.junit.Before;
import org.junit.Test;
import services.decorador.Milk;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class EspressoTest {
    private Beverage b;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        b = new Espresso();
        out = new ByteArrayOutputStream();
        System.setOut( new java.io.PrintStream( out ));
    }

    @Test
    public void testWithMilkCost() {
        b = new DarkRoast();
        b = new Milk(b);
        double esperado = 1.09;
        double obtenido = b.cost();
        assertEquals(esperado, obtenido, 0.01);
    }


    @Test
    public void testGetDescription() {
        String esperado = "espresso";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }

    @Test
    public void testWithDobleMilkCost() {
        b = new Milk(b);
        b = new Milk(b);
        double esperado = 2.19;
        double obtenido = b.cost();
        assertEquals( esperado, obtenido, 0.01 );
    }

    @Test
    public void testWithDobleMilkDescription() {
        b = new Milk(b);
        b = new Milk(b);
        String esperado = "espresso, with steamed milk, with steamed milk";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals( esperado, obtenido );
    }

    @Test
    public void testToString() {
        String esperado = "espresso{'description'='espresso'}";
        String obtenido = b.toString().toLowerCase();
        assertEquals( esperado, obtenido );
    }
}