package services;

import org.junit.Before;
import org.junit.Test;
import services.decorador.Milk;
import services.decorador.Soy;
import services.decorador.Mocha;
import services.decorador.Whip;
import services.decorador.SteamedMilk;

import static org.junit.Assert.*;

public class HouseBlendTest {

    private Beverage b;

    @Before
    public void setUp() throws Exception {
        b = new HouseBlend();
    }

    @Test
    public void testCost() {
        double esperado = 0.89;
        double obtenido = b.cost();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testGetDescription() {
        String esperado = "houseblend";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testWithMilkCost() {
        b = new Milk(b);
        double esperado = 0.99;
        double obtenido = b.cost();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testWithMilkDescription() {
        b = new Milk(b);
        String esperado = "houseblend, with steamed milk";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testWithSoyCost() {
        b = new Soy(b);
        double esperado = 1.04;
        double obtenido = b.cost();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testWithSoyDescription() {
        b = new Soy(b);
        String esperado = "houseblend, with soy";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testWithMochaCost() {
        b = new Mocha(b);
        double esperado = 1.09;
        double obtenido = b.cost();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testWithMochaDescription() {
        b = new Mocha(b);
        String esperado = "houseblend, with mocha";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testWithWhipCost() {
        b = new Whip(b);
        double esperado = 0.99;
        double obtenido = b.cost();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testWithWhipDescription() {
        b = new Whip(b);
        String esperado = "houseblend, with whip";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testWithSteamedMilkCost() {
        b = new SteamedMilk(b);
        double esperado = 0.99;
        double obtenido = b.cost();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testWithSteamedMilkDescription() {
        b = new SteamedMilk(b);
        String esperado = "houseblend, with steamedmilk";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testWithMultipleDecoratorsCost() {
        b = new Mocha(b);
        b = new Soy(b);
        b = new Whip(b);
        double esperado = 1.34;
        double obtenido = b.cost();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testWithMultipleDecoratorsDescription() {
        b = new Mocha(b);
        b = new Soy(b);
        b = new Whip(b);
        String esperado = "houseblend, with mocha, with soy, with whip";
        String obtenido = b.getDescription().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
